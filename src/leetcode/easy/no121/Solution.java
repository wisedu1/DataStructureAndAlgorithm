package leetcode.easy.no121;

/**
 * @author wisedu1
 */
public class Solution {
    public int maxProfit(int[] prices) {
        // 股票交易天数
        int n = prices.length;

        if (n < 2) {
            return 0;
        }

        // dp[i][0] 第 i + 1 天结束的时候，不持股，手上拥有的最大现金数
        // dp[i][1] 第 i + 1 天结束的时候，持股，花费的最小现金数，用负数表示
        // int[][] dp = new int[n][2];

        // 优化
        int[] dp = new int[2];

        // 初始条件
        // dp[0][0] = 0;
        // dp[0][1] = -prices[0];
        dp[1] = - prices[0];
        for (int i = 1; i < n; i++) {
            // dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            // dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);

            dp[0] = Math.max(dp[0], dp[1] + prices[i]);
            dp[1] = Math.max(dp[1], -prices[i]);
        }
        // return dp[n - 1][0];
        return dp[0];
    }
}
