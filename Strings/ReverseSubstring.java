public class ReverseSubstring {
    String reverseSubString(String s, int l, int r) {
        StringBuilder sb = new StringBuilder(s);
        while (l < r) {
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);
            l++;
            r--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(new ReverseSubstring().reverseSubString(s, 2, 5));
    }
}
