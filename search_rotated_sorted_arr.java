//search an element in a rotated sorted array
//leetcode problem no. 33
public class search_rotated_sorted_arr {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is at mid
            if (arr[mid] == target) {
                return mid;
            }

            // Determine which side is sorted
            if (arr[left] <= arr[mid]) { // Left side is sorted
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1; // Search in the left half
                } else {
                    left = mid + 1; // Search in the right half
                }
            } else { // Right side is sorted
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1; // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }
        }

        return -1; // Target not found
    }
}
