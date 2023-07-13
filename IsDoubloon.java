public class IsDoubloon {
    public static void main(String[] args) {
        String[] doubloons = {"abba", "anna", "appall", "Hannah", "Toto", "peep", "papa", "Otto", "horseshoer", "Emmet", "sees", "Shanghaiings"};
        String[] notDoubloons = {"yes", "no", " man", "woman", "female", "man"};
        for (int j = 0; j < doubloons.length; j++) {
            System.out.println("Checking if word " + doubloons[j] + " is doubloon: ");
            isDoubloon(doubloons[j]);
        }

        for (int k = 0; k < notDoubloons.length; k++) {
            System.out.println("Checking if word " + notDoubloons[k] + " isn't  doubloon: ");
            isDoubloon(notDoubloons[k]);
        }
    }

    public static void isDoubloon(String word) {
        String wordLowerCased = word.toLowerCase();
        for (int i = 0; i < wordLowerCased.length(); i++) {
            char letter = wordLowerCased.charAt(i);
            if (wordLowerCased.lastIndexOf(letter) == wordLowerCased.indexOf(letter)) {
                System.out.println("this word isn't doubloon");
                return;
            }
        }

        System.out.println("this word is doubloon");
    }
}
