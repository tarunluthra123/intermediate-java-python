def dictionarySort(s):
    count = [0] * 26

    for i in range(len(s)):
        index = ord(s[i]) - ord("a")
        count[index] += 1

    res = []
    for i in range(26):
        for j in range(count[i]):
            res.append(chr(ord("a") + i))

    return "".join(res)


ans = dictionarySort("bhrwiolpabbrrwwhlhp")
print(ans)
