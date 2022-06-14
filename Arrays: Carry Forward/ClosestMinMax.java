public class ClosestMinMax {
    public int closestMinMax(int[] A) {
        int n = A.length;
        int minVal = A[0], maxVal = A[0];
        for (int i = 1; i < n; i++) {
            minVal = Math.min(minVal, A[i]);
            maxVal = Math.max(maxVal, A[i]);
        }

        int minIndex = -1, maxIndex = -1;
        int ans = n;

        for (int i = n - 1; i >= 0; i--) {
            if (A[i] == minVal) {
                minIndex = i;
                if (maxIndex != -1) {
                    int length = maxIndex - minIndex + 1;
                    ans = Math.min(ans, length);
                }
            }
            if (A[i] == maxVal) {
                maxIndex = i;
                if (minIndex != -1) {
                    int length = minIndex - maxIndex + 1;
                    ans = Math.min(ans, length);
                }
            }
        }

        return ans;
    }
}
