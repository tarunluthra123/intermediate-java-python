def checkBit(n, i):
    return ((n >> i) & 1) == 1


def checkBit(n, i):
    return (n & (1 << i)) != 0


def setBits(x, y):
    return (1 << x) | (1 << y)


def setIthBit(n, i):
    return n | (1 << i)


print(checkBit(82, 1))
print(checkBit(82, 2))
print(checkBit(82, 3))
