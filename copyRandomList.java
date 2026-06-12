class copyRandomList {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node curr = head;

        // Step 1: Insert copy nodes
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Assign random pointers
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate lists
        curr = head;
        Node dummy = new Node(0);
        Node copyCurr = dummy;

        while (curr != null) {
            Node copy = curr.next;

            curr.next = copy.next;
            copyCurr.next = copy;

            copyCurr = copy;
            curr = curr.next;
        }

        return dummy.next;
    }
}
