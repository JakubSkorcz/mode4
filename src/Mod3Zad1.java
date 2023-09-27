import org.jetbrains.annotations.NotNull;

public class Mod3Zad1 {
    public int sumArray(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }
}
