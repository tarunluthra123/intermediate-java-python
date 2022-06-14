def maxColumnSum(a):
    maxSum = -float("inf")
    n = len(a)
    m = len(a[0])
    for j in range(m):
        s = 0
        for i in range(n):
            s += a[i][j]
        maxSum = max(maxSum, s)
    return maxSum


a = [[3, 8, 9, 2], [1, 2, 3, 6], [4, 10, 11, 8]]

print(maxColumnSum(a))
