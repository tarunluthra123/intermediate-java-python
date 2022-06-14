class ColSum {
    int maxColumnSum(int[][] a) {
        int maxSum = Integer.MIN_VALUE;
        int n = a.length;
        int m = a[0].length;

        for (int j = 0; j < m; j++) {
            int s = 0;
            for (int i = 0; i < n; i++) {
                s += a[i][j];
            }
            maxSum = Math.max(maxSum, s);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] a = {
                {3, 8, 9, 2}, {1, 2, 3, 6}, {4, 10, 11, 8}
        };

        ColSum obj = new ColSum();
        System.out.println(obj.maxColumnSum(a));
    }
}
