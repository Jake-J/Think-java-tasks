import java.util.Arrays;

public class ArePrimeFactors {
    public static void main(String[] args) {

    }

    public static boolean arePrimeFactors(int n, int[] array) {
        int sum = Arrays.stream(array).sum();
        if (sum != n) {
            return false;
        }
        for (int i : array) {
            if (i <= 1) {
                return false;
            } else {
                if (i % 2 == 0) {
                    return false;
                } else {
                    for (int j = 2; j < Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
