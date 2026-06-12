//questionn739
import java.util.HashMap;
import java.util.Map;

public class parselisp {

    public int evaluate(String expression) {
        return eval(expression, new HashMap<>());
    }

    private int eval(String expr, Map<String, Integer> scope) {
        if (expr.charAt(0) != '(') {
            if (Character.isDigit(expr.charAt(0)) || expr.charAt(0) == '-')
                return Integer.parseInt(expr);
            return scope.get(expr);
        }

        Map<String, Integer> newScope = new HashMap<>(scope);
        expr = expr.substring(1, expr.length() - 1);

        if (expr.startsWith("let")) {
            expr = expr.substring(4);
            while (true) {
                String var = expr.substring(0, expr.indexOf(' '));
                expr = expr.substring(var.length() + 1);
                if (expr.indexOf(' ') == -1 || !isVar(var)) {
                    return eval(expr, newScope);
                }
                int val = eval(nextToken(expr), newScope);
                newScope.put(var, val);
                expr = expr.substring(nextToken(expr).length() + 1);
            }
        } else if (expr.startsWith("add")) {
            expr = expr.substring(4);
            String first = nextToken(expr);
            String second = expr.substring(first.length() + 1);
            return eval(first, newScope) + eval(second, newScope);
        } else {
            expr = expr.substring(5);
            String first = nextToken(expr);
            String second = expr.substring(first.length() + 1);
            return eval(first, newScope) * eval(second, newScope);
        }
    }

    private boolean isVar(String s) {
        return Character.isLetter(s.charAt(0));
    }

    private String nextToken(String expr) {
        if (expr.charAt(0) == '(') {
            int count = 0;
            for (int i = 0; i < expr.length(); i++) {
                if (expr.charAt(i) == '(') count++;
                if (expr.charAt(i) == ')') count--;
                if (count == 0) return expr.substring(0, i + 1);
            }
        }
        int idx = expr.indexOf(' ');
        return idx == -1 ? expr : expr.substring(0, idx);
    }

    public static void main(String[] args) {
        parselisp sol = new parselisp();
        System.out.println(sol.evaluate("(let x 2 (mult x (let x 3 y 4 (add x y))))"));
        System.out.println(sol.evaluate("(add 1 2)"));
        System.out.println(sol.evaluate("(mult 3 (add 2 3))"));
    }
}