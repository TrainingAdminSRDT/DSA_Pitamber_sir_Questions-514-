//question46
import java.util.*;
public class Perm {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, new boolean[nums.length], new ArrayList<>(), res);
        return res;
    }
    private void solve(int[] nums, boolean[] used, List<Integer> curr, List<List<Integer>> res) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            curr.add(nums[i]);
            solve(nums, used, curr, res);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}