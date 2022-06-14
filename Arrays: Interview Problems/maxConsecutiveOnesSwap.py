def maxConsecutiveOnesSwap(arr):
    n = len(arr)
    ans = 0

    c = 0
    for i in range(n):
        if arr[i] == 1:
            c += 1

    if c == n:
        return n

    for i in range(n):
        if arr[i] == 0:
            # Count consecutive ones on left side
            l = 0
            for j in range(i - 1, -1, -1):
                if arr[j] == 1:
                    l += 1
                else:
                    break

            # Count consecutive ones on right side
            r = 0
            for j in range(i + 1, n):
                if arr[j] == 1:
                    r += 1
                else:
                    break

            if l + r == c:
                ans = max(ans, l + r)
            else:
                ans = max(ans, l + r + 1)

    return ans


ans = maxConsecutiveOnesSwap([0, 1, 1, 1, 0, 1, 1, 0])
print(ans)
