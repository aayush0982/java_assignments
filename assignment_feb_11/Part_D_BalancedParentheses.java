package assignment_feb_11;

import java.util.Stack;

public class Part_D_BalancedParentheses {

    static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char open = stack.pop();
                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "{[()]}";

        if (isBalanced(expr))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
