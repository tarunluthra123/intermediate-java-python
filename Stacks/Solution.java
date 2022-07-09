class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Stack {
    Node head = null;
    int s = 0;

    void push(int x) {
        Node n = new Node(x);
        n.next = head;
        head = n;
        s++;
    }

    void pop() throws Exception {
        if (head == null) {
            throw new Exception("Stack underflow error");
        }
        head = head.next;
        s--;
    }

    int top() throws Exception {
        if (head == null) {
            throw new Exception("Stack underflow error");
        }
        return head.data;
    }

    int size() {
        return s;
    }
}

class Solution {
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        // s.pop(); // Error
    }
}
