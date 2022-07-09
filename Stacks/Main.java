import java.util.ArrayList;

class Stack {
    ArrayList<Integer> l = new ArrayList<>();

    void push(int x) {
        l.add(x);
    }

    void pop() throws Exception {
        if (this.size() == 0) {
            System.out.println("Stack is empty");
            throw new Exception("Stack is empty");
        }
        l.remove(l.size() - 1);
    }

    int top() throws Exception {
        if (l.size() == 0) {
            System.out.println("Stack is empty");
            throw new Exception("Stack is empty");
        }
        return l.get(l.size() - 1);
    }

    int size() {
        return l.size();
    }
}

class Main {
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