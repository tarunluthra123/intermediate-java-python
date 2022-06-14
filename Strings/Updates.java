class Updates {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder(s);
        sb.append("d");
        sb.append("e");
        sb.append("f");

        s = sb.toString();

        System.out.println(s);
    }
}