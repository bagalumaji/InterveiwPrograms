package strings;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String  str = "abcaebafd";
        System.out.println(getLongestSubString(str));
    }
    static int getLongestSubString(String str){
        int start=0;
        int end=0;
        int max=0;
        HashSet<Character> characters = new HashSet<>();

        while(end!=str.length()){
            if(!characters.contains(str.charAt(end))){
                characters.add(str.charAt(end));
                end++;
                max = Math.max(characters.size(),max);
            }
            else {
                characters.remove(str.charAt(start));
                start++;
            }
        }
        System.out.println(str.substring(start, end));
        return max;

    }
}
