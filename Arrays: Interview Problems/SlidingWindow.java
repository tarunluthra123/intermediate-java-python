class SlidingWindow {
    int maxSumOfSubarrayWithLengthK(int[] arr, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 4, -2, 5, 3, -2, 8, 2, 1, 4};
        int k = 6;

        SlidingWindow obj = new SlidingWindow();
        int ans = obj.maxSumOfSubarrayWithLengthK(arr, k);
        System.out.println(ans);
    }
}
