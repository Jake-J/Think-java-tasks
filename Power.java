import java.math.BigInteger;

public class Power {
    public static void main(String[] args) {
        System.out.println("10 raised to the power of 10 equal " + power(10, 10));
        System.out.println("5 raised to the power of 2 equal " + power(5, 2));
        System.out.println("3 raised to the power of 3 equal " + power(3, 3));
    }

    public static BigInteger power(int x, int n) {
        if (n == 0) {
            return BigInteger.ONE;
        } else {
            return power(x, n - 1).multiply(BigInteger.valueOf(x));
        }

    }
}
