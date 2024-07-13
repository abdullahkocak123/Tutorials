import java.util.ArrayList;
import java.util.Arrays;

public class VowelCount {
    public int getVowelCount(String str) {
        int count = 0;
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u')) ;
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
