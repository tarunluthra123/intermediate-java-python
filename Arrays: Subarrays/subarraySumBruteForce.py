def addSubarray(A, start, end):
    s = 0
    for i in range(start, end + 1):
        s += A[i]
    return s


def subarraySumBruteForce(A):
    n = len(A)
    for i in range(n):
        for j in range(i, n):
            s = addSubarray(A, i, j)
            print(s)


subarraySumBruteForce([1, 2, 3])
