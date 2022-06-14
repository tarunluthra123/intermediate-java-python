
public class ToggleCase {
    static String toggle(String s) {
        StringBuilder sb = new StringBuilder(s);
        int diff = Math.abs('a' - 'A');
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.setCharAt(i, c -= diff);
            } else if (c >= 'A' && c <= 'Z') {
                sb.setCharAt(i, c += diff);
            }
        }
        return sb.toString();
    }

    static String toggleXor(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            sb.setCharAt(i, (char) (c ^ 32));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aBcAEd";
        System.out.println(toggle(s));
        System.out.println(toggleXor(s));
    }
}
