public class LPS {
    int palindromeLength(String s, int p1, int p2) {
        while (p1 >= 0 && p2 < s.length() && s.charAt(p1) == s.charAt(p2)) {
            p1--;
            p2++;
        }
        return p2 - p1 - 1;
    }

    int lps(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            // s[i] is center
            int p1 = i, p2 = i;
            ans = Math.max(ans, palindromeLength(s, p1, p2));

            // s[i] and s[i+1] are center
            p1 = i;
            p2 = i + 1;
            ans = Math.max(ans, palindromeLength(s, p1, p2));
        }

        return ans;
    }

    public static void main(String[] args) {
        int ans = new LPS().lps("cbbbd");
        System.out.println(ans);
    }
}
