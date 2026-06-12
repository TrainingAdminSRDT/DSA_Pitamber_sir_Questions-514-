class Node:
    def __init__(self, data):
        self.data = data
        self.children = []      # List to store child nodes


class NaryTree:
    def __init__(self, root_data):
        self.root = Node(root_data)

    def add_child(self, parent, child_data):
        child = Node(child_data)
        parent.children.append(child)
        return child

    def display(self, node, level=0):
        if node is None:
            return

        print(" " * level * 4 + str(node.data))

        for child in node.children:
            self.display(child, level + 1)