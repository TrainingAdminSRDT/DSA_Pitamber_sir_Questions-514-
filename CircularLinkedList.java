public class CircularLinkedList {
    
    // Node structure
    private static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }
    
    // We track 'last' instead of 'head' for O(1) insertions at both ends
    private Node last = null;

    // 1. Insert into an empty list or at the beginning
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        
        if (last == null) {
            last = newNode;
            last.next = last; // Points to itself to form a circle
        } else {
            newNode.next = last.next; // New node points to the old head
            last.next = newNode;      // Last node points to the new head
        }
    }

    // 2. Insert at the end of the list
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next; // New node points to head
            last.next = newNode;      // Old last node points to new node
            last = newNode;           // Update the last pointer to the new node
        }
    }

    // 3. Traverse and print the list
    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        
        Node temp = last.next; // Start from the head node
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != last.next); // Stop when we loop back to the head
        
        System.out.println("(Head)");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        
        cll.insertAtLast(10);
        cll.insertAtLast(20);
        cll.insertAtLast(30);
        cll.insertAtFirst(5); // Insert at the front
        
        System.out.print("Circular Linked List: ");
        cll.display(); 
        // Output: 5 -> 10 -> 20 -> 30 -> (Head)
    }
}