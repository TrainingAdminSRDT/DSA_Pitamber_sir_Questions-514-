//question40
import java.util.*;
public class CombSum2 {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        solve(0, nums, target, new ArrayList<>(), res);
        return res;
    }

    private void solve(int idx, int[] nums, int target, List<Integer> curr, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) continue;
            if (nums[i] > target) break;
            curr.add(nums[i]);
            solve(i + 1, nums, target - nums[i], curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}