class MaxConsecutiveOnesSwap {
    int maxConsecutiveOnesSwap(int[] arr) {
        int n = arr.length;
        int ans = 0;

        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                c++;
            }
        }
        if (c == n)
            return n;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                // Count consecutive ones on left side
                int l = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] == 1) {
                        l++;
                    } else {
                        break;
                    }
                }

                // Count consecutive ones on right side
                int r = 0;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == 1) {
                        r++;
                    } else {
                        break;
                    }
                }

                if (l + r == c) {
                    ans = Math.max(ans, l + r);
                } else {
                    ans = Math.max(ans, l + r + 1);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 1, 1, 0};
        MaxConsecutiveOnesSwap obj = new MaxConsecutiveOnesSwap();
        int ans = obj.maxConsecutiveOnesSwap(arr);
        System.out.println(ans);
    }
}
