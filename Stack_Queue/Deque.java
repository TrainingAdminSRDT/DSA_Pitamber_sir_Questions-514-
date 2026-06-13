public class Deque {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    public Deque(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void insertFront(int x) {
        if (isFull()) {
            System.out.println("Deque Full");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }
        arr[front] = x;
        size++;
    }
    public void insertRear(int x) {
        if (isFull()) {
            System.out.println("Deque Full");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        arr[rear] = x;
        size++;
    }
    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque Empty");
            return -1;
        }
        int val = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return val;
    }
    public int deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque Empty");
            return -1;
        }
        int val = arr[rear];
        if (front == rear) {
            front = rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
        return val;
    }
    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }
    public int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    public static void main(String[] args) {
        Deque dq = new Deque(5);
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertFront(2);
        System.out.println("Front: " + dq.getFront());
        System.out.println("Rear: " + dq.getRear());
        dq.deleteFront();
        dq.deleteRear();
        System.out.println("After deletions:");
        System.out.println("Front: " + dq.getFront());
        System.out.println("Rear: " + dq.getRear());
    }
}