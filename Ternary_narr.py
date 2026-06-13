# ---------------- N-ary Tree ----------------

class NaryNode:
    def __init__(self, data):
        self.data = data
        self.children = []


class NaryTree:
    def __init__(self, root_data):
        self.root = NaryNode(root_data)

    def add_child(self, parent, child_data):
        child = NaryNode(child_data)
        parent.children.append(child)
        return child

    def display(self, node):
        if node is None:
            return

        print(node.data, end=" ")

        for child in node.children:
            self.display(child)


# ---------------- Ternary Tree ----------------

class TernaryNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.middle = None
        self.right = None


class TernaryTree:
    def __init__(self, root_data):
        self.root = TernaryNode(root_data)

    def preorder(self, node):
        if node is None:
            return

        print(node.data, end=" ")

        self.preorder(node.left)
        self.preorder(node.middle)
        self.preorder(node.right)


# ---------------- Main ----------------

# N-ary Tree Example
print("N-ary Tree Traversal:")
n_tree = NaryTree(1)

node2 = n_tree.add_child(n_tree.root, 2)
node3 = n_tree.add_child(n_tree.root, 3)
node4 = n_tree.add_child(n_tree.root, 4)

n_tree.add_child(node2, 5)
n_tree.add_child(node2, 6)

n_tree.display(n_tree.root)

print("\n")

# Ternary Tree Example
print("Ternary Tree Preorder Traversal:")
t_tree = TernaryTree(1)

t_tree.root.left = TernaryNode(2)
t_tree.root.middle = TernaryNode(3)
t_tree.root.right = TernaryNode(4)

t_tree.root.left.left = TernaryNode(5)
t_tree.root.left.middle = TernaryNode(6)
t_tree.root.left.right = TernaryNode(7)

t_tree.preorder(t_tree.root)