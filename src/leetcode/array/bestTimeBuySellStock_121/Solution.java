package leetcode.array.bestTimeBuySellStock_121;

/**
 * Accepted
 * 1ms
 *
 * What improved later: I used "isInitialized" boolean
 * to initialize the value. Later used Integer.MAX_VALUE to check.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int currentPrice : prices) {
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            } else {
                int currentProfit = currentPrice - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices1 = {7,1,5,3,6,4};
        System.out.println("Prices1 Profit: " + solution.maxProfit(prices1));
        int[] prices2 = {7,6,4,3,1};
        System.out.println("Prices2 Profit: " + solution.maxProfit(prices2));
        int[] prices3 = {2, 4, 1};
        System.out.println("Prices3 Profit: " + solution.maxProfit(prices3));
        int[] prices4 = {3,2,6,5,0,3};
        System.out.println("Prices4 Profit: " + solution.maxProfit(prices4));
    }
}
