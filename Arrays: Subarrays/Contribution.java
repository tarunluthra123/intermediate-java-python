public class Contribution {
    int contributionSum(int[] A) {
        int n = A.length;
        int s = 0;

        for (int i = 0; i < n; i++) {
            int c = (i + 1) * (n - i);
            s = s + (A[i] * c);
        }

        return s;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Contribution obj = new Contribution();
        System.out.println(obj.contributionSum(arr));
    }
}
