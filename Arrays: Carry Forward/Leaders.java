public class Leaders {
    public int solve(int[] A) {
        int n = A.length;
        int c = 1;
        int maxVal = A[n-1];
        
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] > maxVal) {
                c++;
                maxVal = A[i];
            }
        }
        
        return c;
    }

    public static void main(String[] args) {
        
    }
}
