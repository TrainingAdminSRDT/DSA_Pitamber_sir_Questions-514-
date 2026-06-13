public class TernaryTree {
    static class Node {
        int data;
        Node left, middle, right;
        Node(int data) {
            this.data = data;
        }
    }
    public void traverse(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        traverse(root.left);
        traverse(root.middle);
        traverse(root.right);
    }

    public static void main(String[] args) {
        TernaryTree tree = new TernaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.middle = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.middle = new Node(6);
        root.middle.right = new Node(7);
        System.out.print("Ternary Tree Traversal: ");
        tree.traverse(root);
    }
}