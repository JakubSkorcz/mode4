import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mod4Zad2 {

    public void passwordValidator() {
        System.out.println("Napisz exit aby wyjsc.");
        while(true) {
            String password = userInput();
            if(password.equals("exit")){
                break;
            }
            boolean lengthOK = hasGoodLength(password);
            boolean upperCaseOk = hasUpperCase(password);
            boolean numberOk = hasNumbers(password);
            boolean specialOK = hasSpecialCharacter(password);
            boolean spacesOk = hasNoWhiteSpaces(password);
            boolean repetitionsOk = hasNoRepetitions(password);
            boolean sumOk = specialOK & lengthOK & numberOk & spacesOk & repetitionsOk & upperCaseOk;
            if (sumOk) {
                testPass();
            } else {
                testFail();
            }
        }
    }

    private String userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj haslo do sprawdzenia:");
        return sc.nextLine();
    }

    private void testPass(){
        System.out.println("-----------------------------");
        System.out.println("Twoje haslo spelnia wymagania!");
        System.out.println("-----------------------------");
    }

    private void testFail(){
        System.out.println("-----------------------------");
        System.out.println("Twoje haslo NIE spelnia wymagan!");
        System.out.println("-----------------------------");
    }

    private boolean hasGoodLength(String password) {
        if (password.length() >= 12) {
            System.out.println("Dlugosc hasla: OK");
            return true;
        } else {
            System.out.println("Twoje haslo ma " + password.length() + " znakow");
            System.out.println("Wymagana minimalna dlugosc hasla to 12 znakow");
            return false;
        }
    }

    private boolean hasNoWhiteSpaces(String password) {
        if (password.contains(" ")) {
            System.out.println("Brak pustych spacji: NOK");
            return false;
        } else {
            System.out.println("Brak pustych spacji: OK");
            return true;
        }
    }

    private boolean hasNoRepetitions(String password) {
        int length = password.length() - 1;
        boolean lettersPass;
        lettersPass = true;
        for (int i = 0; i < length; i++) {
            char letter1 = password.charAt(i);
            char letter2 = password.charAt(i + 1);
            if (letter1 == letter2) {
                lettersPass = false;
                break;
            }
        }
        if (lettersPass) {
            System.out.println("Brak takich samych znakow obok siebie: OK");
            return true;
        } else {
            System.out.println("Brak takich samych znakow obok siebie: NOK");
            return false;
        }
    }

    private boolean hasNumbers(String password) {
        int length = password.length() - 1;
        boolean isDigit;
        isDigit = false;
        for (int i = 0; i <= length; i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                isDigit = true;
                break;
            }
        }
        if (isDigit) {
            System.out.println("Conajmniej jedna liczba: OK");
            return true;
        }
        else {
            System.out.println("Conajmniej jedna liczba: NOK");
            return false;
        }
    }

    private boolean hasSpecialCharacter(String password){
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        boolean b = m.find();
        if (b) {
            System.out.println("Specjalny znak: OK");
            return true;
        } else {
            System.out.println("Specjalny znak: NOK");
            return false;
        }
    }

    private boolean hasUpperCase(String password){
        int length = password.length() - 1;
        boolean isUpperCase;
        isUpperCase = false;
        for (int i = 0; i <= length; i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                isUpperCase = true;
                break;
            }
        }
        if (isUpperCase) {
            System.out.println("Conajmniej jedna duża litera: OK");
            return true;
        }
        else {
            System.out.println("Conajmniej jedna duża litera: OK");
            return false;
        }
    }
}