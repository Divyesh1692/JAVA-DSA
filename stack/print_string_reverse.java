public class print_string_reverse {
    public static void main(String[] args) {
        String s = "hello good morning";

        char[] stack = s.toCharArray();

        int top = stack.length-1;

        while(top >-1) {
            top = pop(stack, top);
        }

    }
    private static int pop(char[] stack, int top){
        if(top==-1){
            System.out.println("stack is empty");
            return top;
        }
        System.out.print(stack[top]);
        top--;
        return top;
    }

}
