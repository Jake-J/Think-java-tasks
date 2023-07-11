public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("main works");
        squareRoot(4);
        squareRoot(9);
        squareRoot(16);
        squareRoot(25);
        squareRoot(36);
    }

    public static void squareRoot(double a) {
        double x = a / 2;
        double aSqrt = Math.sqrt(a);

        while (Math.abs(x - aSqrt) > 0.0001) {
            x = (x + a / x) / 2;
        }

        System.out.println("square root completed job");
        System.out.println("x = " + x + " aSqrt = " + aSqrt);
    }
}
