public class check_palindrom {
    public static void main(String[] args) {
       String s1 = "aba";
        System.out.println(function(s1,0,s1.length()-1));
    }

    public static boolean function(String s1,int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s1.charAt(start) != s1.charAt(end)) {
            return false;
        }

        return function(s1, start + 1, end - 1);
    }
}
