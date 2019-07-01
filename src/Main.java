import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        System.out.println("VALUE  : " + isHavingAllParentheses("{a+() + b}"));

    }

    static boolean isHavingAllParentheses(String string) {

        Stack<Character> stack = new Stack<>();

        System.out.println("////////////////////");

        for (int i = 0; i < string.length(); i++) {

            System.out.println("     ");
            System.out.println("for : i " + string.charAt(i));
            System.out.println("     ");

            if (!stack.empty()) {
                System.out.println("top stack : " + stack.peek());
            }
            if (string.charAt(i) == '(' || string.charAt(i) == '[' || string.charAt(i) == '{') {
                stack.push(string.charAt(i));
            }

            if (string.charAt(i) == ')' || string.charAt(i) == ']' || string.charAt(i) == '}') {
                if (!stack.empty()) {
                    stack.pop();
                }
            }

            System.out.println("////////////////////");
        }

        if (stack.empty()) {
            return true;
        }
        else
            return false;
    }

}