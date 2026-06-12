class Node:

    def __init__(self, data):
        self.data = data
        self.next = None



def findMiddle(head):

    slow = head
    fast = head


    while fast != None and fast.next != None:

        slow = slow.next

        fast = fast.next.next


    return slow.data



# Create linked list

head = Node(10)
head.next = Node(20)
head.next.next = Node(30)
head.next.next.next = Node(40)
head.next.next.next.next = Node(50)


print(findMiddle(head))