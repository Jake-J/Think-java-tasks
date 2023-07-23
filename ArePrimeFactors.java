import java.util.Arrays;

public class ArePrimeFactors {
    public static void main(String[] args) {
        int[] primeNumbers = { 2, 3, 5, 7, 11 };
        int primeNumbersSum = 28;
        int primeNumbersWrongSum = 29;

        int[] notPrimeNumbers = { 4, 6, 9, 15 };
        int notPrimeNumbersSum = 34;

        System.out.println("Following numbers: ");
        System.out.println(Arrays.toString(primeNumbers));
        System.out.print(arePrimeFactors(primeNumbersSum, primeNumbers) ? "are " : "are not ");
        System.out.println("prime factors of " + primeNumbersSum);
        System.out.println();

        System.out.println("Following numbers: ");
        System.out.println(Arrays.toString(notPrimeNumbers));
        System.out.print(arePrimeFactors(notPrimeNumbersSum, notPrimeNumbers) ? "are " : "are not ");
        System.out.println("prime factors of " + notPrimeNumbersSum);
        System.out.println();

        System.out.println("Following numbers: ");
        System.out.println(Arrays.toString(primeNumbers));
        System.out.print(arePrimeFactors(primeNumbersWrongSum, primeNumbers) ? "are " : "are not ");
        System.out.println("prime factors of " + primeNumbersWrongSum);
    }

    public static boolean arePrimeFactors(int n, int[] array) {
        int sum = Arrays.stream(array).sum();
        if (sum != n) {
            System.err.println("numbers don't sum correctly");
            return false;
        }
        for (int i : array) {
            if (i <= 1) {
                System.err.println("number 1 is not prime");
                return false;
            } else {
                if (i != 2 && i % 2 == 0) {
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
