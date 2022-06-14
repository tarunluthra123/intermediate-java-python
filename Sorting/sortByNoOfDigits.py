from functools import cmp_to_key


# If no of digits are same, larger value should come first
def myDigitsComparator(a, b):
    digitsOfA = len(str(a))
    digitsOfB = len(str(b))

    if digitsOfA == digitsOfB:
        return b - a
    else:
        return digitsOfA - digitsOfB


def sortByNoOfDigits(A):
    A.sort(key=cmp_to_key(myDigitsComparator))
    return A


def main():
    A = [50, 23, 763, 1000, 2, 9, 451]
    print(sortByNoOfDigits(A))


main()
