import java.util.Stack;

public class get_min_T01 {
    public static void main(String[] args) {

        getMinStack stk = new getMinStack();
        stk.pushEle(15);
        stk.pushEle(5);
        stk.pushEle(10);
        System.out.println(stk.getMin());
        stk.pushEle(15);
        stk.pushEle(5);
        stk.pushEle(2);
        stk.pushEle(1);

    }
}

class  getMinStack {
    Stack<Integer> stk = new Stack<>();
    Stack<Integer>  minStk = new Stack<>();

    void pushEle(int e){
        stk.push(e);
        if(minStk.isEmpty()|| e<=minStk.peek()){
            minStk.push(e);
        }else{
            minStk.push(minStk.peek());
        }
    }

    void popEle(){
        if(!stk.isEmpty()){
            stk.pop();
            minStk.pop();
        }
    }

    int getMin(){
       return minStk.peek();
    }




}
