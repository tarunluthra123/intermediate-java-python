from functools import cmp_to_key


def countFactors(n):
    c = 0
    for i in range(1, n + 1):
        if n % i == 0:
            c += 1
    return c


def myFactorComparator(a, b):
    factorsOfA = countFactors(a)
    factorsOfB = countFactors(b)

    if factorsOfA == factorsOfB:
        return a - b
    else:
        return factorsOfA - factorsOfB


def main():
    A = [9, 3, 4, 8, 16, 37, 6, 13, 15]
    A.sort(key=cmp_to_key(myFactorComparator))

    print(A)


main()
