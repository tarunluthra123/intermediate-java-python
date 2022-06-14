def nobleInteger2(A):
    n = len(A)
    A.sort()
    ans = 0
    c = 0
    if A[0] == 0:
        ans = 1
    for i in range(1, n):
        if A[i] != A[i - 1]:
            c = i

        if A[i] == c:
            ans += 1

    return ans


print(nobleInteger2([-10, 1, 1, 3, 100]))
print(nobleInteger2([0, 0, 1, 1, 2]))
