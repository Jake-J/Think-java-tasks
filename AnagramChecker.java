import java.util.Scanner;

public class AnagramChecker {
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first phrase: ");
        while (!in.hasNext()){
            System.out.println("Your name must consist of only letters");
            in.nextLine();
        }
        String phrase1 = in.nextLine();

        System.out.println("Enter second phrase to compare:");
        while (!in.hasNext()){
            System.out.println("Your name must consist of only letters");
            in.nextLine();
        }

        String phrase2 = in.nextLine();
        int[] letterHist1 = letterHist(phrase1);
        int[] letterHist2 = letterHist(phrase2);

        System.out.println("phrase1 " + phrase1);
        System.out.println("phrase2 " + phrase2);

        for (int i = 0; i < letterHist1.length; i++) {
            if (letterHist1[i] != letterHist2[i]) {
                System.out.println("Entered phrases aren't anagrams");
                return;
            }
        }

        System.out.println("Entered phrases are anagrams");
    }

    public static int[] letterHist(String phrase) {
        int[] azInts = new int[26];

        for (char letter: phrase.toLowerCase().toCharArray()) {
            if (letter != ' ') {
                azInts[alphabet.indexOf(letter)]++;
            }
        }

        return azInts;
    }
}