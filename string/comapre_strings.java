public class comapre_strings {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");

        if(s1.length()!=s2.length()){
            System.out.println("false");
            return;
        }
        for(int i =0; i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
