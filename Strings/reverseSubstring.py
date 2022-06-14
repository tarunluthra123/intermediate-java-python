def reverseSubstring(s, l, r):
    res = list(s)

    while l < r:
        res[l], res[r] = res[r], res[l]
        l += 1
        r -= 1

    return "".join(res)


print(reverseSubstring("abcdefghi", 3, 5))
