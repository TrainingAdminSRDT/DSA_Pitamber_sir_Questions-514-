//question47
import java.util.*;
public class Perm2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
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
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            curr.add(nums[i]);
            solve(nums, used, curr, res);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}