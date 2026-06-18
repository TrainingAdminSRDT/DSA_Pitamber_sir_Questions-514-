import java.util.*;

class LC224_BasicCalculator {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int num = 0;
        int sign = 1;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop();
                result += stack.pop();
            }
        }
        if (num != 0) result += sign * num;
        return result;
    }

    public static void main(String[] args) {
        LC224_BasicCalculator calc = new LC224_BasicCalculator();
        System.out.println(calc.calculate("1 + 1"));
        System.out.println(calc.calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}