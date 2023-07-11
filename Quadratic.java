import java.util.Scanner;

public class Quadratic {
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

        System.out.println(quadratic(a, b, c));
    }

    public static String quadratic(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            return "delta is negative";
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return ("x = " + x);
        } else {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            return "x1 = " + x1 + " x2 = " + x2;
        }
    }
}
