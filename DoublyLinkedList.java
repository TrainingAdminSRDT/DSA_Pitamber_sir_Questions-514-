public class DoublyLinkedList {
    private Node head = null;
    private Node tail = null;

    // 1. Insert at the front of the list
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // 2. Insert at the end of the list
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // 3. Traverse Forward (Head to Tail)
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // 4. Traverse Backward (Tail to Head)
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        
        dll.insertLast(10);
        dll.insertLast(20);
        dll.insertFirst(5); // Front insertion
        
        System.out.print("Forward:  ");
        dll.displayForward();  // Output: 5 <-> 10 <-> 20 <-> null
        
        System.out.print("Backward: ");
        dll.displayBackward(); // Output: 20 <-> 10 <-> 5 <-> null
    }
}