class leetcode 82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;

        while(curr != null){
            if(curr.next != null && curr.val == curr.next.val){
            while(curr.next != null && curr.val == curr.next.val){
                curr = curr.next;
            }
            prev.next = curr.next;
        }else{ // unique value found
            prev = prev.next;
        }
        curr = curr.next;
        }
        return dummy.next;
    }
}
