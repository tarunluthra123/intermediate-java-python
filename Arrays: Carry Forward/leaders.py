def countLeaders(A):
    n = len(A)
    c = 1
    maxVal = A[n - 1]

    for i in range(n - 2, -1, -1):
        if A[i] > maxVal:
            c += 1
            maxVal = A[i]

    return c
