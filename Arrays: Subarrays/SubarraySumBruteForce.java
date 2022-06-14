class SubarraySumBruteForce {
    int addSubarray(int[] A, int start, int end) {
        int s = 0;
        for (int i = start; i <= end; i++) {
            s += A[i];
        }
        return s;
    }

    void subarraySumBruteForce(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int s = addSubarray(A, i, j);
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        SubarraySumBruteForce obj = new SubarraySumBruteForce();
        obj.subarraySumBruteForce(arr);
    }
}
