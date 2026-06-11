
class leetcode 2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        int c = 0;

        while(l1 != null || l2 != null || c != 0) {
            int s = 0;

            if(l1 != null) {
                s += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                s += l2.val;
                l2 = l2.next;
            }

            s += c;
            c = s / 10;

            ListNode temp = new ListNode(s % 10);
            head.next = temp;
            head = head.next;
        }

        return ans.next;
    }
}
