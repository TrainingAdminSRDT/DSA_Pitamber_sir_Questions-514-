class Deque:
    def __init__(self, size):
        self.size = size
        self.arr = [None] * size
        self.front = -1
        self.rear = -1

    def isEmpty(self):
        return self.front == -1

    def isFull(self):
        return ((self.rear + 1) % self.size) == self.front

    def insertFront(self, value):
        if self.isFull():
            print("Deque Overflow")
            return

        if self.isEmpty():
            self.front = self.rear = 0
        elif self.front == 0:
            self.front = self.size - 1
        else:
            self.front -= 1

        self.arr[self.front] = value

    def insertRear(self, value):
        if self.isFull():
            print("Deque Overflow")
            return

        if self.isEmpty():
            self.front = self.rear = 0
        elif self.rear == self.size - 1:
            self.rear = 0
        else:
            self.rear += 1

        self.arr[self.rear] = value

    def deleteFront(self):
        if self.isEmpty():
            print("Deque Underflow")
            return

        value = self.arr[self.front]

        if self.front == self.rear:
            self.front = self.rear = -1
        elif self.front == self.size - 1:
            self.front = 0
        else:
            self.front += 1

        return value

    def deleteRear(self):
        if self.isEmpty():
            print("Deque Underflow")
            return

        value = self.arr[self.rear]

        if self.front == self.rear:
            self.front = self.rear = -1
        elif self.rear == 0:
            self.rear = self.size - 1
        else:
            self.rear -= 1

        return value

    def getFront(self):
        if self.isEmpty():
            return None
        return self.arr[self.front]

    def getRear(self):
        if self.isEmpty():
            return None
        return self.arr[self.rear]


# Driver Code
dq = Deque(5)

dq.insertRear(10)
dq.insertRear(20)
dq.insertFront(5)
dq.insertFront(1)

print("Front:", dq.getFront())  # 1
print("Rear:", dq.getRear())    # 20

print("Deleted Front:", dq.deleteFront())  # 1
print("Deleted Rear:", dq.deleteRear())    # 20

print("Front:", dq.getFront())  # 5
print("Rear:", dq.getRear())    # 10