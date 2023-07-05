public class CheckFermat {
    public static void main(String[] args) {

        checkFermat(2, 3, 3, 5);
        checkFermat(12, 13, 53, 3);
        checkFermat(11, 22, 33, 3);
        checkFermat(11, 22, 33, 4);
        checkFermat(11, 22, 33, 5);
        checkFermat(11, 22, 33, 6);
        checkFermat(11, 22, 33, 7);
        checkFermat(1, 2, 3, 3);

    }

    public static void checkFermat(double a, double b, double c, double n) {
        boolean result = Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n);

        if (n > 2 && result) {
            System.out.println("Fermet was wrong!!!");
        } else {
            System.out.println("No, it isn't working");
        }
    }
}