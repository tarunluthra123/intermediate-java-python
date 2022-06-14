import java.util.Arrays;

class NobleInteger2 {
    int nobleInteger2(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int c = 0, ans = 0;
        if (A[0] == 0)
            ans = 1;
        for (int i = 1; i < n; i++) {
            if (A[i] != A[i - 1])
                c = i;

            if (A[i] == c)
                ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { -10, 1, 1, 3, 100 };
        NobleInteger2 n = new NobleInteger2();
        System.out.println(n.nobleInteger2(arr));
    }
}