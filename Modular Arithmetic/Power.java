public class Power {
    long power(int a, int n, int p) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ((ans % p) * (a % p)) % p;
        }
        return ans;
    }

    public static void main(String[] args) {
        Power p = new Power();
        System.out.println(p.power(3, 2, 10));
    }
}
