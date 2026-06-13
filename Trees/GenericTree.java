import java.util.*;
public class GenericTree {
    static class Node<T> {
        T data;
        List<Node<T>> children;
        Node(T data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }
    public void traverse(Node<?> root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        for (Node<?> child : root.children) {
            traverse(child);
        }
    }

    public static void main(String[] args) {
        GenericTree tree = new GenericTree();
        Node<Integer> root = new Node<>(1);
        Node<Integer> child1 = new Node<>(2);
        Node<Integer> child2 = new Node<>(3);
        Node<Integer> child3 = new Node<>(4);
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);
        child1.children.add(new Node<>(5));
        child1.children.add(new Node<>(6));
        child2.children.add(new Node<>(7));
        System.out.print("Generic Tree Traversal: ");
        tree.traverse(root);
    }
}