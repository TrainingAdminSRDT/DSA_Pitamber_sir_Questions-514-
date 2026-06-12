// question 27
public class element {

    public int removeElement(int[] nums, int val) {
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[left] = nums[i];
                left++;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        element obj = new element();

        int[] nums = {3, 2, 2, 3, 4, 2};
        int val = 2;

        int k = obj.removeElement(nums, val);

        System.out.println("Number of remaining elements: " + k);

        System.out.print("Array after removing " + val + ": ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}