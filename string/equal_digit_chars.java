public class equal_digit_chars {
    public static void main(String[] args) {
        String s="hello125";
        int d =0;
        int c=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&& s.charAt(i)<='z' ||s.charAt(i)>='A'&& s.charAt(i)<='Z'){
                c++;
            }else if(s.charAt(i)>='0'&& s.charAt(i)<='9'){
                d++;
            }
        }
        if(d==c){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}
