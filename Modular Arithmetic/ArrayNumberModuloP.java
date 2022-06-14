public class ArrayNumberModuloP {
    public long solve(int[] arr, int p) {
        int n = arr.length;

        long res = 0;
        long x = 1;

        for (int i = n - 1; i >= 0; i--) {
            res = res + ((arr[i] % p) * x) % p;
            res = res % p;
            x = (x * 10) % p;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2 };
        int p = 10;

        System.out.println(new ArrayNumberModuloP().solve(arr, p));
    }
}
