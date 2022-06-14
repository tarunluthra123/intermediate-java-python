def contributionSum(A):
    n = len(A)
    s = 0
    for i in range(n):
        c = (i + 1) * (n - i)
        s = s + (A[i] * c)
    return s


A = [1, 2, 3]
print(contributionSum(A))
