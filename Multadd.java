public class Multadd {
    public static void main(String[] args) {
        System.out.println(multadd(1.0, 2.0, 3.0));
        System.out.println(multadd(5.5, 7.2, 1.0));
        System.out.println(multadd(6.0, 1.0, 9.0));
        System.out.println(multadd(1, Math.sin(Math.PI/4), Math.cos(Math.PI/4))/2);
        System.out.println(expSum(5));
    }

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }
}
