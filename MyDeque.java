class MyDeque {
    int[] arr;
    int front, rear, size, capacity;

    MyDeque(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void insertFront(int x) {
        if (size == capacity) return;
        front = (front - 1 + capacity) % capacity;
        arr[front] = x;
        size++;
        if (rear == -1) rear = front;
    }

    void insertRear(int x) {
        if (size == capacity) return;
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    int deleteFront() {
        if (size == 0) return -1;
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    int deleteRear() {
        if (size == 0) return -1;
        int val = arr[rear];
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return val;
    }
}
