def countEquilibrium(A):
    n = len(A)

    pf = [0] * n
    pf[0] = A[0]
    for i in range(1, n):
        pf[i] = pf[i - 1] + A[i]

    count = 0

    for i in range(n):
        if i == 0:
            leftSum = 0
        else:
            leftSum = pf[i - 1]

        rightSum = pf[n - 1] - pf[i]
        if leftSum == rightSum:
            count += 1

    return count


ans = countEquilibrium([-7, 1, 5, 2, -4, 3, 0])
print(ans)
