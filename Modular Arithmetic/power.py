def power(a, n, p):
    ans = 1
    for i in range(n):
        ans = ((ans % p) * (a % p)) % p

    return ans


print(power(10, 1000, 23))
