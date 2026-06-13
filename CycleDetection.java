public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        // An empty list or a single node with no next cannot have a cycle
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Traverse the list
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move 1 step
            fast = fast.next.next;    // Move 2 steps

            // If they meet, there is a cycle
            if (slow == fast) {
                return true;
            }
        }

        // If fast reaches null, no cycle exists
        return false;
    }

    public static void main(String[] args) {
        // Constructing a linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        // Creating a cycle: 4 points back to 2
        node4.next = node2;

        System.out.println("Cycle detected: " + hasCycle(head)); // Output: true
    }
}