import java.util.HashSet;
import java.util.HashMap;

class TargetPairSum {
    boolean targetPairSum(int[] A, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
        }

        for (int i = 0; i < A.length; i++) {
            int b = target - A[i];
            if (hm.containsKey(b)) {
                if (A[i] == b && hm.get(b) >= 2)
                    return true;
                else if (A[i] != b)
                    return true;
            }
        }

        return false;
    }

    boolean targetPairSum2(int[] A, int target) {
        HashSet<Integer> s = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            int b = target - A[i];
            if (s.contains(b)) {
                return true;
            }
            s.add(A[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 9, 4, 2 };

        TargetPairSum t = new TargetPairSum();
        System.out.println(t.targetPairSum(arr, 5));

    }
}