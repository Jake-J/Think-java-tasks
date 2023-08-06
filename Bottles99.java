public class Bottles99 {
    public static void main(String[] args) {
        printBottleRow(99);
    }

    public static void printBottleRow(int n) {
        System.out.println(formatBottlesPhrase(n));

        if (n > 1) {
            printBottleRow(n - 1);
        } else {
            System.out.println(
                    "No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.");
        }
    }

    public static String formatBottlesPhrase(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(n == 1 ? " bottle" : " bottles");
        sb.append(" of beer on the wall, ");
        sb.append(n);
        sb.append(n == 1 ? " bottle" : " bottles");
        sb.append(" of beer. Take one down and pass it around - ");
        sb.append(n - 1);

        return sb.toString();
    }
}
