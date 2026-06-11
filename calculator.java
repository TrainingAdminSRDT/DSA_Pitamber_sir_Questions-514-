import java.util.Stack;

class calculator {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();

        int result = 0;
        int number = 0;
        int sign = 1;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }

            else if (ch == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            }

            else if (ch == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            }

            else if (ch == '(') {
                stack.push(result);
                stack.push(sign);

                result = 0;
                sign = 1;
            }

            else if (ch == ')') {
                result += sign * number;
                number = 0;

                result *= stack.pop(); // sign
                result += stack.pop(); // previous result
            }
        }

        result += sign * number;

        return result;
    }
}
