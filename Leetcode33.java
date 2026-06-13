public class RotatedSortedArray {
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Case 1: Target found
            if (nums[mid] == target) {
                return mid;
            }
            
            // Case 2: Check if the Left half is perfectly sorted
            if (nums[left] <= nums[mid]) {
                // Check if target lies within the sorted left half
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // Narrow down to left half
                } else {
                    left = mid + 1;  // Target is in the right half
                }
            } 
            // Case 3: The Right half must be perfectly sorted
            else {
                // Check if target lies within the sorted right half
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;  // Narrow down to right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }
        
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("Index of target: " + search(nums, target)); // Output: 4
    }
}