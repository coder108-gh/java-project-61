package hexlet.code;
import org.apache.commons.lang3.ArrayUtils;


public class Utils {
    private static final int[] FIRST_PRIME = {
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101
    };
    public static int getRandom(int maxValue) {
        return (int) (Math.random() * maxValue);
    }

    public static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }

    public static int[] getProgression(int startValue, int delta, int count) {
        int[] progression = new int[count];
        progression[0] = startValue;
        for (int i = 1; i < count; i++) {
            progression[i] = progression[i - 1] + delta;
        }
        return progression;
    }

    public static boolean isPrime(int number) {

       if (number < FIRST_PRIME[FIRST_PRIME.length - 1]) {
           if (ArrayUtils.contains(FIRST_PRIME, number)) {
               return true;
           }
       }

       int stopValue = (int) Math.sqrt(number) + 1;
       for (int i = 0; i < FIRST_PRIME.length; i++) {
           if (FIRST_PRIME[i] > stopValue) {
               return  true;
           }
           if (number % FIRST_PRIME[i] == 0) {
               return false;
           }
       }

       int divider = FIRST_PRIME[FIRST_PRIME.length - 1] + 2;
       while (divider <= stopValue) {
           if (number % divider == 0) {
               return false;
           }
           divider += 2;
       }
       return true;

    }

}
