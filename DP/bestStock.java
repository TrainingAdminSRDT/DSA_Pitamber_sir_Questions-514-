//question121
public class bestStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n];
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            dp[i] = Math.max(dp[i - 1], prices[i] - minPrice);
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        bestStock obj = new bestStock();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
}