public class rev_string {
    public static void main(String[] args) {
       String s1 = "abad";
        System.out.println(function(s1));
    }

    public static String function(String s1) {
        if (s1.isEmpty()) {
            return s1;
        }


        return function(s1.substring(1))+s1.charAt(0);
    }
}
