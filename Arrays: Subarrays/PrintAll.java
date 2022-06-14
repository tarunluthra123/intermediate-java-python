public class PrintAll {
    void printSubarray(int []A, int start, int end) {
        for (int i = start; i<=end;i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    void printAllSubarrays(int []A) {
        int n = A.length;
        for (int i = 0; i<n;i++) {
            for (int j = i; j<n;j++) {
                printSubarray(A, i, j);
            }
        }
    }

    public static void main(String[] args) {
        PrintAll p = new PrintAll();
        int []A = {1, 2, 3, 4, 5};
        p.printAllSubarrays(A);
    }
}
