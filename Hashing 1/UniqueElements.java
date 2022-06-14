import java.util.Arrays;
import java.util.HashSet;

public class UniqueElements {
    static int countOfUnique(Integer[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.size();
    }

    static int countOfUniqueShort(Integer[] arr) {
        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        return set.size();
    }

    public static void main(String[] args) {
        Integer[] arr = { 6, 2, 4, 7, 4, 4, 2, 6, 1 };
        System.out.println(countOfUnique(arr));

        System.out.println(countOfUniqueShort(arr));
    }
}
