class Node:
    data = 0
    next = None

    def __init__(self, x):
        self.data = x
        self.next = None


class Stack:
    head = None
    s = 0

    def push(self, x):
        n = Node(x)
        n.next = self.head
        self.head = n
        self.s += 1

    def pop(self):
        if self.head is None:
            raise Exception("Stack underflow error")

        self.head = self.head.next
        self.s -= 1

    def top(self):
        if self.head is None:
            raise Exception("Stack underflow error")
        return self.head.data

    def size(self):
        return self.s


def main():
    s = Stack()
    s.push(1)
    s.push(2)
    print(s.top())
    s.pop()
    print(s.top())
    s.pop()
    # s.pop() # Error


main()
