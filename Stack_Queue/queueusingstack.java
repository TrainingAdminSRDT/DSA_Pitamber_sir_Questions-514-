//question232
import java.util.Stack;
public class queueusingstack {
    private Stack<Integer> in;
    private Stack<Integer> out;
    public queueusingstack() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        peek();
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    public static void main(String[] args) {
        queueusingstack obj = new queueusingstack();
        obj.push(1);
        obj.push(2);
        System.out.println("Peek: " + obj.peek());
        System.out.println("Pop: " + obj.pop());
        System.out.println("Empty: " + obj.empty());
    }
}