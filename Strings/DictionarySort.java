public class DictionarySort {
    String dictionarySort(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            count[index]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i]; j++) {
                sb.append((char) ('a' + i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "bhrwiolpabbrrwwhlhp";

        System.out.println(new DictionarySort().dictionarySort(s));
    }
}
