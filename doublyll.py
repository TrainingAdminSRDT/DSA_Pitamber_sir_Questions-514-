class Node:

    def __init__(self,data):
        self.data = data
        self.prev = None
        self.next = None



class DoublyLinkedList:

    def __init__(self):
        self.head = None



    def insert(self,data):

        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            return


        temp = self.head

        while temp.next:
            temp = temp.next


        temp.next = new_node
        new_node.prev = temp



    def display(self):

        temp = self.head

        while temp:

            print(temp.data,end=" <-> ")
            temp=temp.next

        print("None")



dll = DoublyLinkedList()

dll.insert(10)
dll.insert(20)
dll.insert(30)

dll.display()