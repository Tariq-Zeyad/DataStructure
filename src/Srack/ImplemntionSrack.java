package Srack;

public class ImplemntionSrack {

    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        for (char ch : exp.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(')
                        || (ch == '}' && top != '{')
                        || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Test 1 (4*8)*{5-5}: " + isBalanced("(4*8)*{5-5}"));     // True
        System.out.println("Test 2 [(4*8)*{5-5}]: " + isBalanced("[(4*8)*{5-5}]")); // True
        System.out.println("Test 3 ((4*8)*{5-5}: " + isBalanced("((4*8)*{5-5}"));   // False
        System.out.println("Test 4 (4*8)*[5-5]: " + isBalanced("(4*8)*[5-5]"));     // True
    }
}
