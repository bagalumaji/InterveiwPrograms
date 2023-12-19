package strings;

public class SeparateZeroToStart {
    public static void main(String[] args) {
        String str="32400121200";
        char [] chars = str.toCharArray();
        int index=0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '0'){
                char t = chars[i];
                chars[i] = chars[index];
                chars[index]=t;
                index++;
            }
        }
        String result = new String(chars);
        System.out.println("result = " + result);
    }
}
