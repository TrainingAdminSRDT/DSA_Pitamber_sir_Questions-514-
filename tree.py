class Node:

    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

root = Node(10)
root.left = Node(15)
root.right = Node(20)

print(root.data)  # Output: 10
print(root.left.data)  # Output: 15         
print(root.right.data)  # Output: 20