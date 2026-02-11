package assignment_feb_11;

import java.util.Stack;

public class BalancedParenthesesCheck {

    static boolean isBalanced(String expr) {
        Stack<Character> stk = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stk.isEmpty()) return false;
                char top = stk.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        String expr1 = "(A+B)";
        String expr2 = "(A+B";

        System.out.println(expr1 + " → " + (isBalanced(expr1) ? "Balanced" : "Not Balanced"));
        System.out.println(expr2 + " → " + (isBalanced(expr2) ? "Balanced" : "Not Balanced"));
    }
}