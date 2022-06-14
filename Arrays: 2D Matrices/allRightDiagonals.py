def allRightDiagonals(a):
    n = len(a)
    m = len(a[0])

    # Iterate 0th row
    for j in range(m):
        # Starting cell = [0, j]
        x = 0
        y = j

        while x < n and y >= 0:
            print(a[x][y], end=" ")
            x += 1
            y -= 1
        print()

    # Iterate (m-1)th col
    for i in range(1, n):
        # Starting cell = [i, m-1]
        x = i
        y = m - 1
        while x < n and y >= 0:
            print(a[x][y], end=" ")
            x += 1
            y -= 1
        print()


matrix = [
    [1, 2, 3, 4, 5],
    [6, 7, 8, 9, 10],
    [11, 12, 13, 14, 15],
]
allRightDiagonals(matrix)
