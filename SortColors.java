<<<<<<< HEAD
import java.util.*;

class SortColors {

    public static void main(String[] args) {

        int[] nums={2,0,2,1,1,0};

        int zero=0,one=0,two=0;

        for (int x : nums) {
            switch (x) {
                case 0 -> zero++;
                case 1 -> one++;
                default -> two++;
            }
        }

        int i=0;

        while (zero-- > 0) nums[i++] = 0;
        while (one-- > 0) nums[i++] = 1;
        while (two-- > 0) nums[i++] = 2;

        System.out.println(Arrays.toString(nums));
    }
}
=======
public class SortColors {

    static void sortColors(int[] nums) {

        int low = 0, mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }

            else if (nums[mid] == 1) {
                mid++;
            }

            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        sortColors(nums);

        System.out.print("Sorted Colors: ");
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}
>>>>>>> 7d3da34bae6c3ec29f611818a3779c6fd722a49b
