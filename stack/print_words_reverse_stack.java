import java.util.Stack;

public class print_words_reverse_stack {
    public static void main(String[] args) {
        String s = "hello good morning";



        int n = s.length();

        Stack<Character> stk = new Stack<>();

        for(int i=0; i<n; i ++){
            if(s.charAt(i)!= ' '){
               stk.push(s.charAt(i));
            }else{
                while(!stk.isEmpty()){
                    System.out.print(stk.pop());
                }
                System.out.print("  ");
            }
        }


        while(!stk.isEmpty()){
            System.out.print(stk.pop());
        }

    }

}
