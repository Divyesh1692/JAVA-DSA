import java.util.Stack;

public class print_string_reverse_stack {
    public static void main(String[] args) {
        String s = "hello good morning";

        Stack<Character> stk = new Stack<>();

       for(int i=0; i<s.length();i++){
           stk.push(s.charAt(i));
       }

       while (!stk.isEmpty()){
           System.out.print(stk.pop());
       }

    }


}
