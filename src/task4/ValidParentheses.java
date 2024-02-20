package task4;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> open = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                open.push(s.charAt(i));
            }else {
                if (open.isEmpty())
                    return false;
                char parentheses = open.pop();
                if (!(s.charAt(i) == ')' && parentheses == '(' || s.charAt(i) == '}' && parentheses =='{'
                    || s.charAt(i) == ']' && parentheses == '[')){
                    return false;
                }
            }
        }
        return open.isEmpty();

    }
}
