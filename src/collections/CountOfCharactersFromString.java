package collections;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharactersFromString {
    public static void main(String[] args) {
        String str = "sayaji bagal";
        System.out.println("getCharacterCount(\"hello\") = " + getCharacterCount(str));
    }

    static Map<Character, Integer> getCharacterCount(String str) {

        Map<Character, Integer> countOfCharacters = new HashMap<>();
        for (int i = 0; i < str.toCharArray().length; i++) {
            if (countOfCharacters.containsKey(str.charAt(i))) {
            countOfCharacters.put(str.charAt(i),countOfCharacters.get(str.charAt(i))+1);
            }else {
                countOfCharacters.put(str.charAt(i),1);
            }
        }
        return countOfCharacters;
    }
}
