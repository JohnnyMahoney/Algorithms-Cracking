package randomAlgs;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if ((c == ')' && top != '(')
                            || (c == ']' && top != '[')
                            || (c == '}' && top != '{')) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        System.out.println(s1 + " is valid: " + isValid(s1));

        String s2 = "()[]{}";
        System.out.println(s2 + " is valid: " + isValid(s2));

        String s3 = "(]";
        System.out.println(s3 + " is valid: " + isValid(s3));
    }
}