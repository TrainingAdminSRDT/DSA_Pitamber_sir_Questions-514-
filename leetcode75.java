public class SortColorsSolution {
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[mid] and nums[low]
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                // Swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                
                high--;
                // Notice we don't increment mid here!
            }
        }
    }
}