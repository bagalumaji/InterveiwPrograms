package strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="aabaa";
        System.out.println("str = " + str);
        System.out.println("checkStringPalindrome(str) = " + checkStringPalindrome(str));
    }

    static boolean checkStringPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
