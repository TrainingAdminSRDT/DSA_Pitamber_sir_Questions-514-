/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0)
            return null;

        int interval = 1;

        while (interval < lists.length) {

            for (int i = 0; i + interval < lists.length; i += interval * 2) {
                lists[i] = merge(lists[i], lists[i + interval]);
            }

            interval *= 2;
        }

        return lists[0];
    }

    private ListNode merge(ListNode a, ListNode b) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (a != null && b != null) {

            if (a.val <= b.val) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }

            curr = curr.next;
        }

        curr.next = (a != null) ? a : b;

        return dummy.next;
    }
}
