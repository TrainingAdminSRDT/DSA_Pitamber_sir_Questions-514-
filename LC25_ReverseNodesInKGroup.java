class LC25_ReverseNodesInKGroup {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (true) {
            ListNode end = prev;
            for (int i = 0; i < k; i++) {
                end = end.next;
                if (end == null) return dummy.next;
            }
            ListNode nextGroup = end.next;
            end.next = null;
            ListNode rev = reverse(prev.next);
            prev.next = rev;
            while (prev.next != null) prev = prev.next;
            prev.next = nextGroup;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}