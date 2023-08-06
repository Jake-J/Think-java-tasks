public class oddSum {

    public static void main(String[] args) {
        System.out.println("are odd numbers below 10 and they sum up to : " + Integer.toString(oddSum(10)));
        System.out.println("are odd numbers below 20 and they sum up to : " + Integer.toString(oddSum(20)));
        System.out.println("are odd numbers below 30 and they sum up to : " + Integer.toString(oddSum(30)));
    }

    public static int oddSum(int n) {
        int sum = 0;
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.print(Integer.toString(n) + ", ");
                sum += n;
            }
            return sum + oddSum(n - 1);
        }

        return sum;

    }
}
