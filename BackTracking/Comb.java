//question77
import java.util.*;
public class Comb {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        solve(1, n, k, new ArrayList<>(), res);
        return res;
    }

    private void solve(int start, int n, int k, List<Integer> curr, List<List<Integer>> res) {
        if (curr.size() == k) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i <= n; i++) {
            curr.add(i);
            solve(i + 1, n, k, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}