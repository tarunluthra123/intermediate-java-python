def countOfUnique(arr):
    s = set()
    for i in range(len(arr)):
        s.add(arr[i])
    return len(s)


def countOfUniqueShort(arr):
    s = set(arr)
    return len(s)


arr = [6, 2, 4, 7, 4, 4, 2, 6, 1]
print(countOfUnique(arr))
print(countOfUniqueShort(arr))
