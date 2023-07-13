public class CanSpell {
    public static void main(String[] args) {
        System.out.println("Can I spell 'can' with 'nac': " + (canSpell("can","nac") ? "yes" : "no"));
        System.out.println("Can I spell 'can' with 'nbc': " + (canSpell("can","nbc") ? "yes" : "no"));
        System.out.println("Can I spell 'mind' with 'nimd': " + (canSpell("mind","nimd") ? "yes" : "no"));
        System.out.println("Can I spell 'mind' with 'gimd': " + (canSpell("mind","gimd") ? "yes" : "no"));
    }

    public static boolean canSpell(String wordToSpell, String availableLetters) {
        if (wordToSpell.length() > availableLetters.length()) {
            System.err.println("there are less avaiable letters than word to spell contains");
            return false;
        } else {
            for (int i = 0; i < wordToSpell.length(); i++) {
                if (availableLetters.indexOf(wordToSpell.charAt(i))  < 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
