public class reverse_words_internally {

    public static void main(String[] args) {
        String s = "good evening";
        int l = 0;



        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                revStr(s, l, i - 1);
                System.out.print(" ");
                l = i + 1;

            }
        }
    }

    public static void revStr(String str, int l, int r) {
        for (int i = r; i >= l; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
