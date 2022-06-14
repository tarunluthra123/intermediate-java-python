import java.util.*;
class RangeQuery {
  static Scanner sc = new Scanner(System.in);
  static void range_query(int []arr) {
    int n = arr.length;

    // Generating the prefix sum array
    int []prefix_sum = new int[n];
    prefix_sum[0] = arr[0];
    for (int i = 1; i < n; i++) {
      prefix_sum[i] = prefix_sum[i - 1] + arr[i];
    }

    // No of queries
    int q = sc.nextInt();

    // Answering q queries
    while (q > 0) {
      q--;
      int l = sc.nextInt();
      int r = sc.nextInt();

      if (l == 0){
        System.out.println(prefix_sum[r]);
      }
      else {
        System.out.println(prefix_sum[r] - prefix_sum[l - 1]);
      }
    }
  }
  public static void main(String[] args) {
    int []arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
    range_query(arr);

  }  
}
