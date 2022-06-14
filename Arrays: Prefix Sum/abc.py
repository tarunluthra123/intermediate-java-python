def solve(A, B):
    n = len(A)
    pre = [0] * (n)
    pre[0] = A[0]
    for i in range(1, n):
        pre[i] = pre[i - 1] + A[i]

    if n == B:
        ans = pre[n - 1]
    else:
        ans = pre[n - 1] - pre[n - B - 1]

    j = n - B + 1
    i = 0
    while j < n:
        startSum = pre[i]
        endSum = pre[n - 1] - pre[j - 1]
        i += 1
        j += 1
        ans = max(ans, startSum + endSum)
    return ans


def main():
    arr = []
