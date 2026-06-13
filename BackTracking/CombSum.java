//question39
import java.util.*;
public class CombSum {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        solve(0, nums, target, new ArrayList<>(), res);
        return res;
    }

    private void solve(int idx, int[] nums, int target, List<Integer> curr, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if (idx == nums.length || target < 0) return;
        curr.add(nums[idx]);
        solve(idx, nums, target - nums[idx], curr, res);
        curr.remove(curr.size() - 1);
        solve(idx + 1, nums, target, curr, res);
    }
}