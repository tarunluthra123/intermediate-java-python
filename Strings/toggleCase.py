def toggle(s):
    l = list(s)
    diff = abs(ord("a") - ord("A"))
    for i in range(len(l)):
        if "a" <= l[i] <= "z":
            l[i] = chr(ord(l[i]) - diff)
        elif "A" <= l[i] <= "Z":
            l[i] = chr(ord(l[i]) + diff)

    return "".join(l)


def toggleXor(s):
    l = list(s)
    for i in range(len(l)):
        l[i] = chr(ord(l[i]) ^ 32)
    return "".join(l)


print(toggle("aBcDEf"))
print(toggleXor("aBcDEf"))
