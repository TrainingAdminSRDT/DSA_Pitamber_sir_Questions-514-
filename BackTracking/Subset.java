//question78
import java.util.*;
public class Subset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), res);
        return res;
    }

    private void solve(int idx, int[] nums, List<Integer> curr, List<List<Integer>> res) {
        res.add(new ArrayList<>(curr));
        for (int i = idx; i < nums.length; i++) {
            curr.add(nums[i]);
            solve(i + 1, nums, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}