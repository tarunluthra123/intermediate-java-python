s = "abc"
s = list(s)  # [a, b, c]

s.append("d")
s.append("e")
s.append("f")

s = "".join(s)
print(s)  # abcdef
