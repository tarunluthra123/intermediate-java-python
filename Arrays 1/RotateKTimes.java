class RotateKTimes {

  static void reverse(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  static void rotate_k_times(int []A, int k) {
    int n = A.length;
    k = k % n;
    
    // Reverse entire array
    reverse(A, 0, n-1);

    // Reverse first k elements
    reverse(A, 0, k-1);

    // Reverse last n-k elements
    reverse(A, k, n-1);
  }
  public static void main(String[] args) {
    int []a = {2, 5, 7, 1, 8, 9, 2, 0, 2, 6, 7, 10};
    int k = 4;

    rotate_k_times(a, k);
    for (int x: a) {
      System.out.print(x + " ");
    }
  }
}