public class check_palindrom {
    public static void main(String[] args) {
        String s = "hello";
        int n = s.length();
        int r=n-1,l=0;
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
