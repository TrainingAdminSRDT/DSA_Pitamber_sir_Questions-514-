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
