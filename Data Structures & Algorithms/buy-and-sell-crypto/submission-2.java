class Solution {
    public int maxProfit(int[] prices) {
        int start = 0; // buy
        int end = 1;   // sell
        int maxProfit = 0;

        while (end < prices.length) {
            if (prices[end] > prices[start]) {
                int profit = prices[end] - prices[start];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                start = end; // reset window
            }
            end++;
        }

        return maxProfit;
    }
}