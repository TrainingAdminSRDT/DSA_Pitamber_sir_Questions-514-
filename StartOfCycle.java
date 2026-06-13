class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycleStart {

    public static ListNode detectCycleStart(ListNode head) {
        if (head == null || head.next == null) {
            return null; // No cycle possible
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        // Step 1: Determine if a cycle exists using standard Floyd's
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break; // Collision detected!
            }
        }

        // If there's no cycle, return null
        if (!hasCycle) {
            return null;
        }

        // Step 2: Reset one pointer to head and move both at a speed of 1
        fast = head; 
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next; // Move fast at speed 1 now
        }

        // They meet at the start of the cycle
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creating a loop back to node 2 (value: 2)

        ListNode cycleStart = detectCycleStart(head);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val); // Output: 2
        } else {
            System.out.println("No cycle detected.");
        }
    }
}