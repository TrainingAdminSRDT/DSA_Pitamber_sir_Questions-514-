//question 155
import java.util.Stack;
public class minstack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public minstack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);

        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        minstack obj = new minstack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println("Minimum: " + obj.getMin());
        obj.pop();
        System.out.println("Top: " + obj.top());
        System.out.println("Minimum: " + obj.getMin());
    }
}