def solve(arr, p):
    n = len(arr)

    res = 0
    x = 1

    for i in range(n - 1, -1, -1):
        res = res + ((arr[i] % p) * x) % p
        res = res % p
        x = (x * 10) % p

    return res


ans = solve([3, 2], 10)
print(ans)
