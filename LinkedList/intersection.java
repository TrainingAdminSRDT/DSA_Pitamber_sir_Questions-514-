//question160
public class intersection {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int n1 = 0;
        int n2 = 0;
        while (tempA != null) {
            n1++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            n2++;
            tempB = tempB.next;
        }
        if (n1 > n2) {
            return collisionFunction(headA, headB, n1 - n2);
        } else {
            return collisionFunction(headB, headA, n2 - n1);
        }
    }

    public ListNode collisionFunction(ListNode t1, ListNode t2, int d) {
        while (d != 0) {
            d--;
            t1 = t1.next;
        }
        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }

    public static void main(String[] args) {
        intersection sol = new intersection();

        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        ListNode headA = new ListNode(1);
        headA.next = new ListNode(3);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = common;

        ListNode result = sol.getIntersectionNode(headA, headB);
        System.out.println(result != null ? result.val : "no intersection");
    }
}