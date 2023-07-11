import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter value A: ");
        if (!in.hasNextDouble()) {
            System.err.println("You haven't enetered a number");
        }
        double a = in.nextDouble();

        System.out.println("Enter value B: ");
        if (!in.hasNextDouble()) {
            System.err.println("You haven't enetered a number");
        }
        double b = in.nextDouble();

        System.out.println("Enter value C: ");
        if (!in.hasNextDouble()) {
            System.err.println("You haven't enetered a number");
        }
        double c = in.nextDouble();

        boolean firstCondition = a > (b + c);
        boolean secondCondition = b > (a + c);
        boolean thirdCondition = c > (a + b);

        if (firstCondition || secondCondition || thirdCondition) {
            System.out.println("Can't make triangle with those values.");
        } else {
            System.out.println("You are able to create triangle with those length.");
        }
    }
}
