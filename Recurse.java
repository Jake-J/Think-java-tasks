public class Recurse {
    public static void main(String[] args) {
        System.out.println("first letter of 'word' is " + first("word"));
        System.out.println("'word' without first letter is " + rest("word"));
        System.out.println("'word' without first and last letter is " + middle("word"));
        System.out.println("length of 'word' is " + length("word"));

        printString("lalala rararara bababa");
    }

    public static char first(String s) {
        return s.charAt(0);
    }

    public static String rest(String s) {
        return s.substring(1);
    }

    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    public static int length(String s) {
        return s.length();
    }

    public static void printString(String s) {
        if (length(s) > 0) {
            System.out.println(first(s));
            printString(rest(s));
        }

    }
}
