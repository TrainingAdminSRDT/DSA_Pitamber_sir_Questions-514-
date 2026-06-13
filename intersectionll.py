class ListNode:
    def __init__(self, val=0):
        self.val = val
        self.next = None


def getIntersectionNode(headA, headB):

    p1 = headA
    p2 = headB

    while p1 != p2:

        if p1:
            p1 = p1.next
        else:
            p1 = headB


        if p2:
            p2 = p2.next
        else:
            p2 = headA


    return p1



# main function
if __name__ == "__main__":

    # common part
    common = ListNode(8)
    common.next = ListNode(4)
    common.next.next = ListNode(5)


    # List A : 4 -> 1 -> 8 -> 4 -> 5
    headA = ListNode(4)
    headA.next = ListNode(1)
    headA.next.next = common


    # List B : 5 -> 6 -> 1 -> 8 -> 4 -> 5
    headB = ListNode(5)
    headB.next = ListNode(6)
    headB.next.next = ListNode(1)
    headB.next.next.next = common


    ans = getIntersectionNode(headA, headB)


    if ans:
        print("Intersection Node:", ans.val)
    else:
        print("No Intersection")