import java.util.HashSet;

public class SubarraySumZero {
    static boolean checkSubarrayWithZeroSum(int[] arr) {
        HashSet<Integer> s = new HashSet<Integer>();

        int prefixSum = arr[0];
        s.add(prefixSum);

        for (int i = 1; i < arr.length; i++) {
            prefixSum += arr[i];
            s.add(prefixSum);
        }

        if (s.size() < arr.length || s.contains(0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, -2, 0, -4 };

        System.out.println(checkSubarrayWithZeroSum(arr));
    }
}
