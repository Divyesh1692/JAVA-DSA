public class print_words_reverse {
    public static void main(String[] args) {
        String s = "hello good morning";

        char[] chars = s.toCharArray();

        int n = chars.length;

        char[] stack = new char[n];
        int top = -1;

        for(int i=0; i<n; i ++){
            if(chars[i]!= ' '){
                top++;
                stack[top]= chars[i];
            }else{
                while(top!=-1){
                    System.out.print(stack[top]);
                    top--;
                }
                System.out.print("  ");
            }
        }


        while(top!=-1){
            System.out.print(stack[top]);
            top--;
        }

    }

}
