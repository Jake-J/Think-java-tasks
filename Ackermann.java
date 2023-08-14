public class Ackermann {
    public static void main(String[] args) {

        System.out.println("ackerman result for m=3 and n=3 " + Integer.toString(ackerman(3, 3)));

        System.out.println("ackerman result for m=0 and n=7 " + Integer.toString(ackerman(0, 7)));

        System.out.println("ackerman result for m=2 and n=5 " + Integer.toString(ackerman(2, 5)));

        System.out.println("ackerman result for m=3 and n=0 " + Integer.toString(ackerman(3, 0)));

    }

    public static int ackerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackerman(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ackerman(m - 1, ackerman(m, n - 1));
        }

        return 0;
    }
}
