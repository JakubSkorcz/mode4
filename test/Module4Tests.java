import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Module4Tests {

    private Mod3Zad3 testSubject = new Mod3Zad3();
    private Mod3Zad1 testSubject2 = new Mod3Zad1();
    @Test
    public void testAlaMaKota(){
        HashMap<String,Integer> wordToCount = new HashMap<>();
        String text = "Ala ma kota, kota ma Ala";
        wordToCount =testSubject.countWords(text);
        System.out.println(wordToCount);
    }

    @Test
    public void testMod3Zad1Positive (){
        int[] filledArray = {1,3,5};
        Assertions.assertEquals(9,testSubject2.sumArray(filledArray));
    }

    @Test
    public void testMod3Zad1Negative (){
        int[] filledArray = {-1,-3,-5};
        Assertions.assertEquals(-9,testSubject2.sumArray(filledArray));
    }

    @Test
            public void test() {
        String password = "Marcinek";
        int length = password.length()-1;
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
            System.out.println("OK");
        } else {
            System.out.println("Nie mozna dwoch takich samych liter kolo siebie");
        }
    }

    @Test
    public void testnumeru() {
        String password = "1dupcia";
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
        }
        else {
            System.out.println("Conajmniej jedna liczba: NOK");
        }
    }

    @Test
    public void testznak(){
        String password = "dupcia";
        if (Pattern.matches("[a-zA-Z]+", password)) {
            System.out.println("Specjalny znak: OK");
        } else {
            System.out.println("Specjalny znak: NOK");
        }
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("d!pcia");
        boolean b = m.find();

        if (b) {
            System.out.println("There is a special character in my string");
        } else {
            System.out.println("nie ma");
        }

    }
    
    @Test
            public void tescik() {
        Mod4Zad2 proba = new Mod4Zad2();
        proba("dupcia123");
    }

    private void proba(String dupcia123) {
    }


}
