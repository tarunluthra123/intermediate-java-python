class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Queue {
    Node head;
    Node tail;
    int size;

    Queue() {
        head = null;
        tail = null;
        size = 0;
    }

    void enqueue(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size = size + 1;
    }

    void dequeue() {
        if (head == null) {
            // Throw error if you want to
            return;
        }
        head = head.next;
        size = size - 1;
    }

    int front() {
        if (head == null) {
            // Throw error if you want to
            return -1;
        }
        return head.data;
    }

    int rear() {
        if (tail == null) {
            // Throw error if you want to
            return -1;
        }
        return tail.data;
    }

    int size() {
        return size;
    }
}

class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(10);
        System.out.println(q.front());
        System.out.println(q.rear());
        q.dequeue();
        System.out.println(q.front());

    }
}
