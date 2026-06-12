//question23
import java.util.PriorityQueue;
public class mergeSorted {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.val, b.val)
        );
        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            tail.next = node;
            tail = tail.next;
            if (node.next != null) {
                pq.offer(node.next);
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        mergeSorted sol = new mergeSorted();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(7);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(5);

        ListNode l3 = new ListNode(3);
        l3.next = new ListNode(6);

        ListNode result = sol.mergeKLists(new ListNode[]{l1, l2, l3});
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}