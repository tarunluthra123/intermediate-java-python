def sumOfAllSubarray(A):
    n = len(A)
    for i in range(n):
        sum = 0
        for j in range(i, n):
            sum += A[j]
            print(sum)


sumOfAllSubarray([1, 2, 3])
