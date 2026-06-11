
class leetcode 876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head , slow = head ;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next ;
            slow = slow.next ;
        }
        return fast.next != null ? slow.next : slow ;
    }
}
