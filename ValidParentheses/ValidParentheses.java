import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.print("Enter a string containing only of brackets: ");
        while (true) {
            s = sc.nextLine();
            if (isValidInput(s)) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a string containing only '(', ')', '{', '}', '[' and ']'.");
            }
        }

        boolean isValid = isValid(s);
        System.out.println("Is the string valid? " + isValid);

        sc.close();
    }
    private static boolean isValidInput(String s) {
        for (char c : s.toCharArray()) {
            if (c != '(' && c != ')' && c != '{' && c != '}' && c != '[' && c != ']') {
                return false;
            }
        }
        return true;
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char c : s.toCharArray()) {
            if (map.containsValue(c)) {
                stack.push(c);
            } else if (map.containsKey(c)) {
                if (stack.isEmpty() || map.get(c) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();        
    }
}
