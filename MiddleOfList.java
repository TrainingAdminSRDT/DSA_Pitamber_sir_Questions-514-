public class LinkedListMiddle {

    public static ListNode findMiddle(ListNode head) {
        // If the list is empty or has only one node, return the head
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move 1 step
            fast = fast.next.next;    // Move 2 steps
        }

        // When fast reaches the end, slow is at the middle
        return slow;
    }

    public static void main(String[] args) {
        // Creating a test linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middle = findMiddle(head);
        
        if (middle != null) {
            System.out.println("The middle node value is: " + middle.val); // Output: 3
        }
    }
}