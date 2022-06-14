class AllRightDiagonals {
    void printAllRightDiagonals(int[][] a) {
        int n = a.length;
        int m = a[0].length;

        // Iterate 0th row
        for (int j = 0; j<m; j++) {
            // Starting cell = [0, j]
            int x = 0;
            int y = j;

            while (x < n && y >= 0) {
                System.out.print(a[x][y] + " ");
                x++;
                y--;
            }
            System.out.println();
        }

        // Iterate (m-1)th col
        for (int i = 1; i < n; i++) {
            // Starting cell = [i, m-1]
            int x = i;
            int y = m - 1;
            while (x < n && y >= 0) {
                System.out.print(a[x][y] + " ");
                x++;
                y--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
        };
        AllRightDiagonals obj = new AllRightDiagonals();
        obj.printAllRightDiagonals(matrix);
    }
}
