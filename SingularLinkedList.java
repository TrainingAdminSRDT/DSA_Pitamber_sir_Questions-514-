public class SinglyLinkedList {
    private Node head = null;

    // 1. Insert a node at the front of the list
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Point new node to the current head
        head = newNode;      // Update head to point to the new node
    }

    // 2. Insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        
        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        // Link the last node to the new node
        current.next = newNode;
    }

    // 3. Print the entire list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtFront(5); // Inserted at the beginning
        
        System.out.print("Singly Linked List: ");
        list.display(); // Output: 5 -> 10 -> 20 -> null
    }
}