package randomAlgs.Stack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    public MinStack() {
      stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        Stack<Integer> tmp = new Stack<>();
        int min = stack.peek();
        while(!stack.isEmpty()) {
            min = Math.min(min, stack.peek());
            tmp.push(stack.pop());
        }

        while (!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }
            return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(-9);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.top();
        minStack.getMin();
    }
}
