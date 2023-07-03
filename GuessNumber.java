import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int attempts = 0;
        boolean isMatch = false;
        int[] enteredNumbers = new int[3];
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        while(attempts < 3 && !isMatch) {
            System.out.println("Enter a number between 1 - 100");

            if (!in.hasNextInt()) {
                System.err.println("Number wasn't enetered");
                return;
            }
            int enteredNumber = in.nextInt();

            if (enteredNumber > 100 || enteredNumber < 1) {
                System.err.println("Number should be between 1 - 100");
                return;
            }

            enteredNumbers[attempts] = enteredNumber;
            attempts++;

            if (number == enteredNumber) {
                isMatch = true;
            } else {
                System.out.print("Miss: number you've entered is ");
                System.out.println(number > enteredNumber
                        ? "smaller than the random one."
                        : "higher than the random one."
                );
            }
        }

        System.out.printf("Number which has been randomed is %d \n", number);
        System.out.println(Arrays.toString(enteredNumbers));
//        System.out.printf(" \nDifference between number you've entered and the randomed one if %d \n", Math.abs(enteredNumber - number));

        System.out.println(isMatch ? "You are a winner!" : "You are a losser!");
    }
}
