//question20
import java.util.Stack;
public class validParaenthese {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty())
                    return false;
                char top = st.peek();
                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        validParaenthese obj = new validParaenthese();
        String s = "()[]{}";
        boolean result = obj.isValid(s);
        System.out.println("Valid Parentheses: " + result);
    }
}