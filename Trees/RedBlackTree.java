public class RedBlackTree {
    static final boolean RED = true;
    static final boolean BLACK = false;
    class Node {
        int data;
        boolean color;
        Node left, right, parent;
        Node(int data) {
            this.data = data;
            color = RED;
        }
    }
    Node root;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            root.color = BLACK;
            return;
        }
        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            if (data < current.data)
                current = current.left;
            else
                current = current.right;
        }
        newNode.parent = parent;
        if (data < parent.data)
            parent.left = newNode;
        else
            parent.right = newNode;
    }
    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(15);
        tree.inorder(tree.root);
    }
}