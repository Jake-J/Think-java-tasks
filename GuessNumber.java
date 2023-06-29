import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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

        Random random = new Random();
        int number = random.nextInt(100) + 1;

        if (number == enteredNumber) {
            System.out.println("You are a winner!");
        } else {
            System.out.println("You are a losser!");
        }

        System.out.printf("Number which has been randomed is %d", number);
        System.out.println();
        System.out.printf("Number you entered is %d", enteredNumber);
        System.out.println();

        System.out.printf(" \nDifference between number you've entered and the randomed one if %d", Math.abs(enteredNumber - number));
    }
}
