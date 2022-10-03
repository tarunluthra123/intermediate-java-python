class Node:
    data = 0
    next = None

    def __init__(self, x):
        self.data = x
        self.next = None


def generateLL(n):
    head = Node(1)
    temp = head

    for i in range(2, n + 1):
        temp.next = Node(i)
        temp = temp.next
    return head


def size(head):
    temp = head
    count = 0
    while temp != None:
        count += 1
        temp = temp.next
    return count


def insert(head, pos, data):
    if pos < 0 or pos > size(head):
        return head

    temp = head
    newNode = Node(data)

    if pos == 0:
        newNode.next = head
        return newNode

    for i in range(pos - 1):
        temp = temp.next

    newNode.next = temp.next
    temp.next = newNode
    return head


def remove(head, pos):
    if pos < 0 or pos > size(head):
        return head

    if pos == 0:
        return head.next

    temp = head
    for i in range(pos - 1):
        temp = temp.next

    temp.next = temp.next.next
    return head


def printLL(head):
    temp = head
    while temp != None:
        print(temp.data, end=" ")
        temp = temp.next
    print()


def main():
    head = generateLL(10)

    printLL(head)

    head = remove(head, 2)

    printLL(head)


main()
