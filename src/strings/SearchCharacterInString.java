package strings;

public class SearchCharacterInString {
    public static void main(String[] args) {
        System.out.println(isCharacterPresent("hello",'u'));
    }
    public static boolean isCharacterPresent(String str,char ch){
        for (char chr:str.toCharArray()){
            if(chr==ch) {
                return true;
            }
        }
        return false;
    }
}
