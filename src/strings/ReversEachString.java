package strings;

public class ReversEachString {
    public static void main(String[] args) {
        String str="hello world";
        StringBuilder result=new StringBuilder();
        for(String s:str.split(" "))
            result.append(reversString(s));

        System.out.println("result = " + result);
    }
    static String reversString(String str){
        StringBuilder sb =  new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.insert(0,str.charAt(i));
        }
        System.out.println("sb = " + sb);
        return sb+" ";
    }
}
