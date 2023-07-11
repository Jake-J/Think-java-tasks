import java.util.Scanner;

public class Abecedariana {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter word to check:");
            while(!in.hasNext()){
                System.out.println("Your name must consist of only letters");
                in.nextLine();
            }
            String word = in.next();

            if (abecedariana(word)) {
                System.out.println("Word enetered is abecedariana");
            } else {
                System.out.println("Word enetered isn't abecedariana");
            }


        }

        public static boolean abecedariana(String word) {
            for (int i = 0; i < word.length(); i++) {
                if (i == word.length() -1) {
                    return true;
                }
                if(word.charAt(i) > word.charAt(i +1)) {
                    return false;
                }
            }

            return true;
        }
}