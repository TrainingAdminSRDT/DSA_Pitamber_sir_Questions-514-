//question53
public class maxSubarray {

    public int maxSubArray(int[] nums) {

        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        int maxSum = dp[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            maxSum = Math.max(maxSum, dp[i]);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        maxSubarray obj = new maxSubarray();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(obj.maxSubArray(nums));
    }
}