import java.util.Stack;

class Leetcode224 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();

        int res = 0;
        int num = 0;
        int sign = 1;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '+') {
                res += sign * num;
                num = 0;
                sign = 1;
            }

            else if (ch == '-') {
                res += sign * num;
                num = 0;
                sign = -1;
            }

            else if (ch == '(') {
                stack.push(res);
                stack.push(sign);

                res = 0;
                sign = 1;
            }

            else if (ch == ')') {
                res += sign * num;
                num = 0;

                res *= stack.pop(); // sign
                res += stack.pop(); // previous res
            }
        }

        return res + sign * num;
    }
}
