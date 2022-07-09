class Stack:
    l = []

    def push(self, x):
        self.l.append(x)

    def pop(self):
        if len(self.l) == 0:
            print("Stack is empty")
            raise Exception("Stack is empty")
        self.l.pop()

    def top(self):
        if len(self.l) == 0:
            print("Stack is empty")
            raise Exception("Stack is empty")
        return self.l[-1]

    def size(self):
        return len(self.l)


s = Stack()
s.push(1)
s.push(2)
print(s.top())
s.pop()
print(s.top())
s.pop()
# s.pop()
