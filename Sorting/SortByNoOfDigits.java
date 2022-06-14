import java.util.*;

class MyDigitComparator implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        int aDigits = (a + "").length();
        int bDigits = (b + "").length();

        if (aDigits == bDigits)
            return b - a;
        else
            return aDigits - bDigits;
    }
}

public class SortByNoOfDigits {
    public static void main(String[] args) {
        Integer[] A = { 50, 23, 763, 1000, 2, 9, 451 };
        MyDigitComparator c = new MyDigitComparator();
        Arrays.sort(A, c);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
