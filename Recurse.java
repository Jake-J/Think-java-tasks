public class Recurse {
    public static void main(String[] args) {
        System.out.println("first letter of 'word' is " + first("word"));
        System.out.println("'word' without first letter is " + rest("word"));
        System.out.println("'word' without first and last letter is " +
                middle("word"));
        System.out.println("length of 'word' is " + length("word"));

        printString("lalala rararara bababa \n\n\n");
        printBackward("printing backward \n\n\n");
        printBackward("drawkcab gnitnirp \n\n\n");

        System.out.println("a czemu to kurwa nie dziala ?");
        System.out.println(reverseString("kakao"));
        System.out.println(reverseString("salamon"));
        System.out.println(reverseString("kinderbueno"));

        System.out.println("is 'kajak' a polindrom ? ");
        System.out.println(isPalindrome("kajak") ? "yes" : "no");
        System.out.println("is 'radar' a polindrom ? ");
        System.out.println(isPalindrome("radar") ? "yes" : "no");
        System.out.println("is 'markopolo' a polindrom ? ");
        System.out.println(isPalindrome("markopolo") ? "yes" : "no");
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

    public static void printBackward(String s) {
        final String reversed = new StringBuilder(s).reverse().toString();
        printString(reversed);
    }

    public static String reverseString(String s) {
        StringBuilder sB = new StringBuilder("");

        for (int i = s.length() - 1; i >= 0; i--) {
            sB.append(s.charAt(i));
        }

        return sB.toString();
    }

    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
