import java.util.Stack;

public class Infix_to_prefix {
    public static void main(String[] args) {
        String infix = "(A+B)*(C-D)";
        String prefix = infixToPrefix(infix);
        System.out.println("Prefix: " + prefix);
    }

    public static String infixToPrefix(String infix) {
        Stack<String> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                operands.push(ch + "");
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    process(operands, operators);
                }
                if (!operators.isEmpty() && operators.peek() == '(') {
                    operators.pop(); // remove '('
                }
            } else if (isOperator(ch)) {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    process(operands, operators);
                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
            process(operands, operators);
        }

        return operands.peek();
    }

    private static void process(Stack<String> operands, Stack<Character> operators) {
        String op2 = operands.pop();
        String op1 = operands.pop();
        char op = operators.pop();
        String exp = op + op1 + op2;
        operands.push(exp);
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return 0;
    }
}



