import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * This class uses sieve of eratosthenes to print
 * prime numbers from 1 to n number passed in by user.
 */
public class Sieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter integer: ");
        while (!in.hasNextInt()) {
            System.out.println("Wrong input try again!");
            in.nextLine();
        }
        int number = in.nextInt();

        int[] numberArray = IntStream.rangeClosed(2, number).toArray();

        boolean[] newArray = Arrays.copyOfRange(sieve(number), 2, sieve(number).length);

        System.out.println("Prime numbers in range 1 to " + number + " are:");
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i]) {
                String separator = i == (newArray.length - 1) ? "" : ", ";
                System.out.print(numberArray[i] + separator);
            }
        }
        System.out.println();
    }

    public static boolean[] sieve(int n) {
        boolean[] array = new boolean[n + 1];
        Arrays.fill(array, Boolean.TRUE);
        int p = 2;

        while (p < n) {
            for (int i = (p + p); i < array.length; i += p) {
                array[i] = Boolean.FALSE;
            }

            p++;
        }

        return array;
    }
}
