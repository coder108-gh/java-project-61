package hexlet.code;

public class Utils {
    public static int getRandom(int maxValue) {
        return (int)(Math.random() * maxValue);
    }

    public static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }


}
