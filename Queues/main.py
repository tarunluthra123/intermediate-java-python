class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Queue:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def enqueue(self, x):
        new_node = Node(x)
        if self.head is None:
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node
        self.size += 1

    def dequeue(self):
        if self.head is None:
            # Throw error if you want to
            return
        self.head = self.head.next
        self.size -= 1

    def front(self):
        if self.head is None:
            # Throw error if you want to
            return -1
        return self.head.data

    def rear(self):
        if self.tail is None:
            # Throw error if you want to
            return -1
        return self.tail.data

    def size(self):
        return self.size


def main():
    q = Queue()
    q.enqueue(5)
    q.enqueue(10)
    print(q.front())
    print(q.rear())
    q.dequeue()
    print(q.front())


main()
