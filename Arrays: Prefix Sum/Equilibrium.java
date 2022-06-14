public class Equilibrium {

  static int countEquilibrium(int[] arr) {
    int n = arr.length;

    int[] pf = new int[n];
    pf[0] = arr[0];

    for (int i = 1; i < n; i++) {
      pf[i] = pf[i - 1] + arr[i];
    }

    int count = 0;

    for (int i = 0; i < n; i++) {
      int leftSum, rightSum;
      if (i == 0) {
        leftSum = 0;
      } else {
        leftSum = pf[i - 1];
      }
      rightSum = pf[n - 1] - pf[i];
      if (leftSum == rightSum) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
    int ans = countEquilibrium(arr);
    System.out.println(ans);
  }
}
