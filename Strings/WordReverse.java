public class WordReverse {
    char[] reverse(char[] A, int l, int r) {
        while (l < r) {
            char temp = A[l];
            A[l] = A[r];
            A[r] = temp;
            l++;
            r--;
        }
        return A;
    }

    char[] wordReverse(char[] A) {
        int n = A.length;

        int l = 0;
        int r = 1;

        reverse(A, 0, n - 1);

        while (r < n) {
            if (A[r] == ' ') {
                reverse(A, l, r - 1);
                l = r + 1;
            }
            r++;
        }
        reverse(A, l, n - 1);

        return A;
    }

    public static void main(String[] args) {
        String s = "I am a student";
        WordReverse w = new WordReverse();
        char[] res = w.wordReverse(s.toCharArray());

        System.out.println(res);
    }
}
