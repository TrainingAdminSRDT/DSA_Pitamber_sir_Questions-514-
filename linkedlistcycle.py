class ListNode:
    def __init__(self, val=0):
        self.val = val
        self.next = None


def hasCycle(head):

    slow = head
    fast = head

    while fast and fast.next:

        slow = slow.next
        fast = fast.next.next

        if slow == fast:
            return True

    return False



# main function
if __name__ == "__main__":

    # creating linked list
    # 3 -> 2 -> 0 -> -4

    head = ListNode(3)
    second = ListNode(2)
    third = ListNode(0)
    fourth = ListNode(-4)


    head.next = second
    second.next = third
    third.next = fourth

    # creating cycle
    fourth.next = second


    result = hasCycle(head)

    print(result)