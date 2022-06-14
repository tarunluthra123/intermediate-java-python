import java.util.*;

public class DistinctElementsInWindow {
    void distinctElementsInWindow(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        for (int i = 0; i < k; i++) {
            // freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            if (freq.containsKey(arr[i]))
                freq.put(arr[i], freq.get(arr[i]) + 1);
            else
                freq.put(arr[i], 1);
        }

        System.out.println(freq.size());

        int i = 1;
        int j = k;

        while (i <= (n - k)) {
            // Subarray - [i j]

            // Remove (i-1)th element
            freq.put(arr[i - 1], freq.get(arr[i - 1]) - 1);

            if (freq.get(arr[i - 1]) == 0)
                freq.remove(arr[i - 1]);

            // Add (j)th element
            // freq.put(arr[j], freq.getOrDefault(arr[j], 0) + 1);
            if (freq.containsKey(arr[j]))
                freq.put(arr[j], freq.get(arr[j]) + 1);
            else
                freq.put(arr[j], 1);

            System.out.println(freq.size());

            i++;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 8, 3, 9, 4, 9, 4, 10 };
        int k = 4;

        DistinctElementsInWindow obj = new DistinctElementsInWindow();
        obj.distinctElementsInWindow(arr, k);
    }
}
