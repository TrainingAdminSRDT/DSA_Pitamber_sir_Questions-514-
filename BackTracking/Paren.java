//question22
import java.util.*;
public class Paren {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve("", 0, 0, n, res);
        return res;
    }
    private void solve(String curr, int open, int close, int n, List<String> res) {
        if (curr.length() == n * 2) {
            res.add(curr);
            return;
        }
        if (open < n)
            solve(curr + "(", open + 1, close, n, res);
        if (close < open)
            solve(curr + ")", open, close + 1, n, res);
    }
}