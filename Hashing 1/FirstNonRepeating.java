import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 5 };
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (freq.get(arr[i]) == 1) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
