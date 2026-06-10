public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == 0)
                count0++;
            else if (nums[i] == 1)
                count1++;
            else
                count2++;
        }

        int i = 0;

        while (count0 > 0) {
            nums[i++] = 0;
            count0--;
        }

        while (count1 > 0) {
            nums[i++] = 1;
            count1--;
        }

        while (count2 > 0) {
            nums[i++] = 2;
            count2--;
        }

        for (i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
}