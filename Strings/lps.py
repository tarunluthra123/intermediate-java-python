def palindromeLength(s, p1, p2):
    while p1 >= 0 and p2 < len(s) and s[p1] == s[p2]:
        p1 -= 1
        p2 += 1
    return p2 - p1 - 1


def lps(s):
    ans = 0

    for i in range(len(s)):
        # s[i] is center
        p1 = i
        p2 = i
        ans = max(ans, palindromeLength(s, p1, p2))

        # s[i] and s[i+1] are center
        p1 = i
        p2 = i + 1
        ans = max(ans, palindromeLength(s, p1, p2))

    return ans


print(lps("cbbbd"))
