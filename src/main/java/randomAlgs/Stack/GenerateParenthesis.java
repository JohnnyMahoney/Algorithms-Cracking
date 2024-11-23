package randomAlgs.Stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    //Recursion with backtracking, means to validate all possible situations
    private void backtrack(int openN, int closedN, int n, List<String> res, StringBuilder stack) {
        if (openN == closedN && openN == n) {
            res.add(stack.toString());
            return;
        }
        if (openN < n) {
            stack.append('(');
            backtrack(openN + 1, closedN, n, res, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
        if (closedN < openN) {
            stack.append(')');
            backtrack(openN, closedN + 1, n, res, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtrack(0, 0, n, res, stack);
        return res;
    }

    public static void main(String[] args) {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        List<String> result = generateParenthesis.generateParenthesis(3);
        System.out.println(result.toString());
    }
}
