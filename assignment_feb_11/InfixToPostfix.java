package assignment_feb_11;

import java.util.Stack;

public class InfixToPostfix {

    static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        if (op == '^') return 3;
        return 0;
    }

    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    static String convertToPostfix(String infix) {
        String postfix = "";
        Stack<Character> stk = new Stack<Character>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                postfix = postfix + ch; 
            } else if (ch == '(') {
                stk.push(ch);
            } else if (ch == ')') {
                while (!stk.isEmpty() && stk.peek() != '(') {
                    postfix = postfix + stk.pop();
                }
                if (!stk.isEmpty() && stk.peek() == '(') {
                    stk.pop();
                }
            } else if (isOperator(ch)) {
                while (!stk.isEmpty() && precedence(stk.peek()) >= precedence(ch)) {
                    postfix = postfix + stk.pop();
                }
                stk.push(ch);
            }
        }

        while (!stk.isEmpty()) {
            postfix = postfix + stk.pop();
        }

        return postfix;
    }

    public static void main(String[] args) {
        String infixExp = "A+B*C";
        System.out.println("Infix Expression: " + infixExp);
        String postfixExp = convertToPostfix(infixExp);
        System.out.println("Postfix Expression: " + postfixExp);
    }
}
