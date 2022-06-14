def printSubarray(A, start, end):
    for i in range(start, end + 1):
        print(A[i], end=" ")
    print()


def printAllSubarrays(A):
    n = len(A)

    for i in range(n):
        for j in range(i, n):
            printSubarray(A, i, j)


printAllSubarrays([2, 7, 3, 4])
