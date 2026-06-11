class Node:

    def __init__(self, data):
        self.data = data
        self.next = None



def traverse(head):

    temp = head

    while temp != None:

        print(temp.data)

        temp = temp.next


head = Node(10)
node2 = Node(20)
node3 = Node(30)
 
head.next = node2
node2.next = node3


traverse(head)