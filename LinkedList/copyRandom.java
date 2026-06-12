//question138
import java.util.HashMap;
public class copyRandom {
    static class Node {
        int val;
        Node next;
        Node random;
        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Node temp = head;
        HashMap<Node, Node> mpp = new HashMap<>();
        while (temp != null) {
            Node newNode = new Node(temp.val);
            mpp.put(temp, newNode);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            mpp.get(temp).next = mpp.get(temp.next);
            mpp.get(temp).random = mpp.get(temp.random);
            temp = temp.next;
        }
        return mpp.get(head);
    }

    public static void main(String[] args) {
        copyRandom sol = new copyRandom();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.random = head.next.next;
        head.next.random = head;
        Node result = sol.copyRandomList(head);
        while (result != null) {
            System.out.println("val: " + result.val + ", random: " + (result.random != null ? result.random.val : "null"));
            result = result.next;
        }
    }
}