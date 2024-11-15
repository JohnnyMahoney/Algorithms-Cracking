package randomAlgs.Stack;

import java.util.Stack;

public class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            }
            else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            }
            else if (token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            }
            else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            }
            else
                stack.push(Integer.parseInt(token));
        }
            return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"1", "2", "+", "3", "*", "4", "-"};

        int result = evalRPN(tokens);
        System.out.println(result);
    }
}
