//question1929
import java.util.Arrays;
public class concatenation {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        concatenation obj = new concatenation();
        int[] nums = {1, 3, 2, 1};
        int[] result = obj.getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}