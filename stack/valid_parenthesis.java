import java.util.Stack;

public class valid_parenthesis {
    public static void main(String[] args) {
        String para = "{[()]}";

        System.out.println(isBalanced(para));

    }

    public static boolean isBalanced(String s){

        Stack<Character> stk = new Stack<>();
        for(int i =0; i<s.length();i++){
            if(s.charAt(i) =='[' ||s.charAt(i) =='{' ||s.charAt(i) =='('){
                stk.push(s.charAt(i));
            }

            else if(s.charAt(i) ==']' ||s.charAt(i) =='}' ||s.charAt(i) ==')'){
                if (stk.isEmpty()) return false;

                char t = stk.pop();
                if(!isMatchingPair(t,s.charAt(i))){
                    return false;
                }
            }
        }
        return stk.isEmpty();

    }
    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
