public class reverse_string {
    public static void main(String[] args) {
        String s = "hello";
        char [] chars = s.toCharArray();
        int n = s.length();
        int r=n-1,l=0;
        while(l<r){
            char temp = chars[l];
            chars[l]=chars[r];
            chars[r]=temp;
            r--;
            l++;
        }
        String s1 = new String(chars);
        System.out.println(s1);
    }
}
