//question 169
import java.util.*;

public class majority {

    public int majorityElement(int[] nums) {
        int target = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > target) {
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        majority obj = new majority();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = obj.majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}