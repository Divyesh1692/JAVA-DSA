import java.util.Stack;

public class check_palindrom {
    public static void main(String[] args) {
        String s ="madam";

        Stack<Character> stk = new Stack<>();

        for(int i=0; i<s.length(); i++){
            stk.push(s.charAt(i));
        }

        for(int i=0; i<s.length(); i++){
           if(s.charAt(i)!= stk.pop()){
               System.out.println("not pali");
               return;
           }
        }
        System.out.println("pali");
    }
}
