public class merge_strings_alternativly {
    public static void main(String[] args) {
        String s1 ="aaa";
        String s2 = "bbb";

        String s = "";

        for (int i=0;i<(s1.length());i++){
           s+=s1.charAt(i);
           s+=s2.charAt(i);
        }
        System.out.println(s);
    }
}
