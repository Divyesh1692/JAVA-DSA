import java.util.Stack;

public class get_min_s01 {
    public static void main(String[] args) {

        minStack stk = new minStack();
         stk.push(10);
        stk.push(9);
        stk.push(11);
        System.out.println(stk.getMin());
        stk.push(8);
        stk.push(5);
        System.out.println(stk.getMin());
        stk.pop();
        System.out.println(stk.getMin());

        stk.push(12);

    }
}

class minStack{
    Stack<Integer> stk = new Stack<>();
    int min;

    public void push(int x){
        if(stk.isEmpty()){
            stk.push(x);
            min = x;
        }else{
            if(x<min){
                stk.push(2*x-min);
                min = x;
            }else {
                stk.push(x);
            }
        }
    }

    public void pop(){
        if(stk.isEmpty()){
            return;
        }
        int t = stk.pop();
        if(t<min){
            min = 2*min - t;
        }
    }
    public int getMin() {
        return min;
    }

}