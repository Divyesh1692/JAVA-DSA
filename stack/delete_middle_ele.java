import java.util.Arrays;
import java.util.Stack;

public class delete_middle_ele {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        int n=11;
        for (int i = 1; i<=n; i++) {
            stk.push(i);
        }

        System.out.println(stk);

        deleteMiddle(stk,n);

        System.out.println(stk);
    }

    static void deleteMiddle(Stack<Integer> stack, int n){
        Stack<Integer> tmp = new Stack<>();
        int middle = n/2;

        for(int i=1; i<=middle; i++){
            tmp.push(stack.pop());
        }

        if(!stack.isEmpty()){
            System.out.println("middle ele: "+stack.pop());
        }

        while (!tmp.empty()){
            stack.push(tmp.pop());
        }
    }

}
