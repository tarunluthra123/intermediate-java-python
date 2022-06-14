public class BitManipulation2 {
    // boolean checkBit(int n, int i) {
    // return ((n >> i) & 1) == 1;
    // }

    boolean checkBit(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    int setBits(int x, int y) {
        return (1 << x) | (1 << y);
    }

    int setIthBit(int n, int i) {
        return n | (1 << i);
    }

    public static void main(String[] args) {
        int ans = new BitManipulation2().setBits(3, 3);
        System.out.println(ans);
    }
}
