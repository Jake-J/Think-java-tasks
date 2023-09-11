import java.util.stream.IntStream;
import java.math.BigInteger;


public class Big {
    public static void main(String[] args) {
        int[] arr = IntStream.range(1, 30).toArray();

        for (int num: arr) {
            System.out.println("factorial of " + num + " is equal to " + factorial(num));
        }
    }

    public static BigInteger factorial(int n) {
        if (n == 0) {
           return BigInteger.ONE;
        }

        BigInteger result = BigInteger.ONE;
        for (int i = n; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}