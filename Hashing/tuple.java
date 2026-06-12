//question1726
import java.util.HashMap;
public class tuple {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                map.put(product, map.getOrDefault(product, 0) + 1);
            }
        }

        int result = 0;
        for (int count : map.values()) {
            if (count > 1) {
                result += count * (count - 1) / 2 * 8;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        tuple obj = new tuple();
        int[] nums = {2, 3, 4, 6};
        int result = obj.tupleSameProduct(nums);
        System.out.println("Tuple Count: " + result);
    }
}