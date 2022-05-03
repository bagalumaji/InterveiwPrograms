package strings;

public class FirstNonRecurringCharacter {
    public static void main(String[] args) {
        String str="java programming";
        System.out.println("firstNonRecurringCharacter(str) = " + firstNonRecurringCharacter(str));
    }
    static char firstNonRecurringCharacter(String str){
        char ch=' ';
        for (int i = 0; i < str.toCharArray().length; i++) {
            int l1 = str.length();
            ch= str.charAt(i);
            int l2 = str.replace(ch+"","").length();
            if(l1==(l2+1))
                break;

        }
        return ch;
    }
}
