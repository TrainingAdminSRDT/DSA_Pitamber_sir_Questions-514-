public class CheckSortedRotated {

    static boolean check(int[] nums) {

        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }

            if (count > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 1, 2};

        boolean result = check(nums);

        System.out.println("Is Sorted & Rotated? " + result);
    }
}