package strings;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s="{()}";
        System.out.println("isValid() = " + isValid(s));
    }
    static boolean isValid(String s) {
     if(s.isBlank() || s.length()<2)
         return false;

        Stack<Character> stack = new Stack<>();

        for(Character ch : s.toCharArray()){
            switch (ch){
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case '}':
                    if(stack.isEmpty() || !stack.pop().equals('{'))
                        return false;
                    break;
                case ')':
                    if(stack.isEmpty() || !stack.pop().equals('('))
                        return false;
                    break;
                case ']':
                    if(stack.isEmpty() || !stack.pop().equals('['))
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
