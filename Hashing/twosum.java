//question 1
import java.util.HashMap;
import java.util.Arrays;

public class twosum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];

            if (set.containsKey(c)) {
                return new int[]{set.get(c), i};
            }

            set.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}