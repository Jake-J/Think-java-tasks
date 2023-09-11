import java.util.stream.IntStream;

public class Big {
    public static void main(String[] args) {
        int[] arr = IntStream.range(1, 30).toArray();

        for (int num: arr) {
            System.out.println("factorial of " + num + " is equal to " + factorial(num));
        }
    }

    public static long factorial(int n) {
        if (n == 0) {
           return 1;
        }

        long result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }

        return result;
    }
}