class Node {
    int data = 0;
    Node next = null;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Main {
    static Node generateLL(int n) {
        Node head = new Node(1);
        Node temp = head;
        for (int i = 2; i <= n; i++) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        return head;
    }

    static int size(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    static Node insert(Node head, int pos, int data) {
        if (pos < 0 || pos > size(head)) {
            return head;
        }
        Node temp = head;
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = generateLL(10);

        System.out.println(head.data);
        System.out.println(head.next.data);

    }
}
