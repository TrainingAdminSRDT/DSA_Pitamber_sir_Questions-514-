//question216
import java.util.*;
public class Comb3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        solve(1, k, n, new ArrayList<>(), res);
        return res;
    }

    private void solve(int start, int k, int target, List<Integer> curr, List<List<Integer>> res) {
        if (target == 0 && curr.size() == k) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0 || curr.size() > k) return;
        for (int i = start; i <= 9; i++) {
            curr.add(i);
            solve(i + 1, k, target - i, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}