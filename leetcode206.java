class leetcode206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextNode = curr.next; // 1. Save the next node
            curr.next = prev;              // 2. Reverse the link
            prev = curr;                   // 3. Move prev forward
            curr = nextNode;               // 4. Move curr forward
        }
        
        return prev; // prev is now the new head
    }
}
