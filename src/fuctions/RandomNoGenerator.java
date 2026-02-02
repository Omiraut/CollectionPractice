package fuctions;
import java.util.Random;
public class RandomNoGenerator {


public static int getRandomNumber(int digits) {
    if (digits < 1 || digits > 7) {
        throw new IllegalArgumentException("Digits must be >= 1 and <= 7");
    }

    int min = (int) Math.pow(10, digits - 1);
    int max = (int) Math.pow(10, digits) - min;

    return new Random().nextInt(max) + min;
}

}
