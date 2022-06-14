def reverse(A, start, end):
    while start < end:
        A[start], A[end] = A[end], A[start]
        start += 1
        end -= 1


def rotate_k_times(A, k):
    n = len(A)
    k = k % n

    # Reverse entire array
    reverse(A, 0, n - 1)

    # Reverse first k elements
    reverse(A, 0, k - 1)

    # Reverse last n-k elements
    reverse(A, k, n - 1)


def main():
    a = [2, 5, 7, 1, 8, 9, 2, 0, 2, 6, 7, 10]
    k = 4
    rotate_k_times(a, k)
    print(a)


main()
