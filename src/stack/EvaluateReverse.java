package stack;

import java.util.Objects;
import java.util.Stack;

public class EvaluateReverse {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (!Objects.equals(token, "+") && !Objects.equals(token, "-") && !Objects.equals(token, "*") && !Objects.equals(token, "/")) {
                stack.push(Integer.valueOf(token));
            } else {
                int first = stack.pop();
                int second = stack.pop();
                switch (token) {
                    case "+" -> stack.push(first + second);
                    case "-" -> stack.push(second - first);
                    case "/" -> stack.push(second / first);
                    case "*" -> stack.push(first * second);
                }
            }
        }
        return stack.pop();
    }
}
