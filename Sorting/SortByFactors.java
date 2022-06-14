import java.util.Arrays;
import java.util.Comparator;

class MyFactorComparator implements Comparator<Integer> {
    int countFactors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        return c;
    }

    public int compare(Integer a, Integer b) {
        int factorsOfA = countFactors(a);
        int factorsOfB = countFactors(b);

        if (factorsOfA == factorsOfB)
            return a - b;
        else
            return factorsOfA - factorsOfB;
    }
}

class Main {
    public static void main(String[] args) {
        Integer[] A = { 9, 3, 4, 8, 16, 37, 6, 13, 15 };
        MyFactorComparator c = new MyFactorComparator();
        Arrays.sort(A, c);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}