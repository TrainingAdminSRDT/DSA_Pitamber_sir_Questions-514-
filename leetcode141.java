public class leetcode141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;       // moves 1 step
            fast = fast.next.next;  // moves 2 steps
            
            if (slow == fast) {     // loop detected
                return true;
            }
        }
        
        return false;               // fast reached the end, no loop
    }
}
