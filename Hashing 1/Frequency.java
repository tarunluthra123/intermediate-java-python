import java.util.Scanner;
import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 1, 7, 8, 9, 2, 7, 5, 10, 8 };
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }

        // Answer Q queries
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        while (Q-- > 0) {
            int query = sc.nextInt();
            if (freq.containsKey(query)) {
                System.out.println(freq.get(query));
            } else {
                System.out.println(0);
            }
        }
    }
}