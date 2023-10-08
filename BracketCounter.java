public class BracketCounter {

    public static void main(String[] args) {
        System.out.println("'hello() ))) (((' how many wrong brackets is here " +  countBrackets("hello() ))) ((("));
        System.out.println("'hello() )))' how many wrong brackets is here " +  countBrackets("hello() )))"));
        System.out.println("'hello() (((' how many wrong brackets is here " +  countBrackets("hello() ((("));
    }

    public static int countBrackets(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }

        return count;
    }
}



