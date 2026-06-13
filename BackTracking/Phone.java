//question17
import java.util.*;
public class Phone {
    String[] map = {"", "", "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;
        solve(0, digits, "", res);
        return res;
    }

    private void solve(int idx, String digits, String curr, List<String> res) {
        if (idx == digits.length()) {
            res.add(curr);
            return;
        }
        String letters = map[digits.charAt(idx) - '0'];
        for (char c : letters.toCharArray()) {
            solve(idx + 1, digits, curr + c, res);
        }
    }
}