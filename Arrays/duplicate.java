//question 26
public class duplicate {

    public int removeDuplicates(int[] nums) {
        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }

    public static void main(String[] args) {
        duplicate obj = new duplicate();

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        int k = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}