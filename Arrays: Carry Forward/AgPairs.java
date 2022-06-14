public class AgPairs {
    public int solve(String A) {
        int n = A.length(), ans = 0, MOD = 1000 * 1000 * 1000 + 7;
        int c = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (A.charAt(i) == 'G')
                c++;
            else if (A.charAt(i) == 'A')
                ans = (ans + c) % MOD;
        }

        return ans;
    }
}