class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {

            // Duplicate found
            if (current.next != null &&
                current.val == current.next.val) {

                int duplicateValue = current.val;

                while (current != null &&
                    current.val == duplicateValue) {
                    current = current.next;
                }

                prev.next = current;
            }
            else {
                prev = prev.next;
                current = current.next;
            }
        }

        return dummy.next;
    }
}