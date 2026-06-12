//question19
public class removen {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (count == n) {
            return head.next;
        }
        int result = count - n;
        temp = head;
        for (int i = 1; i < result; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        removen sol = new removen();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = sol.removeNthFromEnd(head, 2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}