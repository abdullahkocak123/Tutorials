import java.util.ArrayList;

public class TalToAltay {
    public String execute(String str) {
        String[] words = str.split(" ");
        ArrayList<String> newWords = new ArrayList<>();
        for (String word : words) {
            char[] wordCharArray = word.toCharArray();
            if (Character.isLetter(wordCharArray[0])) {
                newWords.add(word.substring(1) + word.charAt(0) + "ay");
            } else {
                newWords.add(word);
            }
        }
        return String.join(" ", newWords);
    }
}
