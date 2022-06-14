def transpose(a):
    n = len(a)
    for i in range(n):
        for j in range(i):
            a[i][j], a[j][i] = a[j][i], a[i][j]


def rotateMatrix(a):
    # Transpose the matrix
    transpose(a)

    # Reverse each row
    n = len(a)
    for i in range(n):
        for j in range(n // 2):
            a[i][j], a[i][n - j - 1] = a[i][n - j - 1], a[i][j]


a = [
    [1, 2, 3, 4, 5],
    [6, 7, 8, 9, 10],
    [11, 12, 13, 14, 15],
    [16, 17, 18, 19, 20],
    [21, 22, 23, 24, 25],
]

rotateMatrix(a)
print(a)
