import java.util.Stack;

class MyQueue {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }
    
    // Pushes element x to the back of the queue.
    public void push(int x) {
        inputStack.push(x);
    }
    
    // Removes the element from the front of the queue and returns it.
    public int pop() {
        shiftStacks();
        return outputStack.pop();
    }
    
    // Returns the element at the front of the queue.
    public int peek() {
        shiftStacks();
        return outputStack.peek();
    }
    
    // Returns true if the queue is empty, false otherwise.
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    // Helper method to move elements from input to output stack when needed
    private void shiftStacks() {
        // Only move elements if the output stack is empty.
        // This preserves the chronological order of the elements.
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
    }
}
