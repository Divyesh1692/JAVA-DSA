import java.util.Stack;
public class prefix_toInfix {


        public static void main(String[] args) {
            String prefix = "*+AB-CD";  // Example: (A + B) * (C - D)

            String infix = convertToInfix(prefix);
            System.out.println("Infix expression: " + infix);
        }

        public static String convertToInfix(String prefix) {
            Stack<String> stack = new Stack<>();

            // Scan from right to left
            for (int i = prefix.length() - 1; i >= 0; i--) {
                char ch = prefix.charAt(i);

                if (isOperator(ch)) {
                    // Pop two operands
                    String op1 = stack.pop();
                    String op2 = stack.pop();

                    // Combine into infix expression
                    String exp = "(" + op1 + ch + op2 + ")";
                    stack.push(exp);
                } else {
                    // Operand - push to stack
                    stack.push(ch + "");
                }
            }

            // Result
            return stack.peek();
        }

        public static boolean isOperator(char ch) {
            return ch == '+' || ch == '-' || ch == '*' || ch == '/';
        }


    }



