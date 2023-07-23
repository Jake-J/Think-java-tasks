import java.util.Scanner;

public class LetterHist {
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter word to check:");
        while(!in.hasNext()){
            System.out.println("Your name must consist of only letters");
            in.nextLine();
        }
        String word = in.next();
        int[] histogram = letterHist(word);

        for (int i = 0; i < alphabet.length(); i++) {
            if (histogram[i] > 0) {
                System.out.println(alphabet.toCharArray()[i] + " " + histogram[i]);
            }
        }
    }

    public static int[] letterHist(String word) {
        int[] azInts = new int[26];

        for (char letter: word.toCharArray()) {
            azInts[alphabet.indexOf(letter)]++;
        }

        return azInts;
    }
}
