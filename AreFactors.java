public class AreFactors {
    public static void main(String[] args) {
        System.out.println(areFactors(5, new int[] { 10, 250, 235, 3855, 75 }));
        System.out.println(areFactors(5, new int[] { 10, 250, 235, 3855, 75, 69 }));
    }

    public static boolean areFactors(int n, int[] array) {
        for (int i : array) {
            if (i % n != 0) {
                return false;
            }
        }
        return true;
    }
}
