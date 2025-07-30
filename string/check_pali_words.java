public class check_pali_words {
    public static void main(String[] args) {
        String s = "good eve";
        int l = 0;



        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                isPali(s, l, i - 1);
                System.out.print(" ");
                l = i + 1;

            }
        }
    }

    public static void isPali(String s, int l, int r) {
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                System.out.println("not pali");
                return;
            }
            r--;
            l++;
        }
        System.out.println("pali");
    }
}
