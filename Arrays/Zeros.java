//question 283
import java.util.Arrays;

public class Zeros {

    public void moveZeroes(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
    }

    public static void main(String[] args) {
        Zeros obj = new Zeros();

        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before: " + Arrays.toString(nums));

        obj.moveZeroes(nums);

        System.out.println("After:  " + Arrays.toString(nums));
    }
}