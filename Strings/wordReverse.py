def reverse(A, l, r):
    while l < r:
        A[l], A[r] = A[r], A[l]
        l += 1
        r -= 1
    return A


def wordReverse(A):
    n = len(A)

    l = 0
    r = 1

    reverse(A, 0, n - 1)

    while r < n:
        if A[r] == " ":
            reverse(A, l, r - 1)
            l = r + 1
        r += 1
    reverse(A, l, r - 1)
    return A


def main():
    # I am a student
    A = ["I", " ", "a", "m", " ", "a", " ", "s", "t", "u", "d", "e", "n", "t"]

    # ['s', 't', 'u', 'd', 'e', 'n', 't', ' ', 'a', ' ', 'a', 'm', ' ', 'I']
    res = wordReverse(A)

    # student a am I
    print("".join(res))


main()
