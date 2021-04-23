package leetcode.hard.no123;

/**
 * @author wisedu1
 */
public class Solution {
    public int maxProfit(int[] prices) {
        // 交易天数
        int n = prices.length;

        if (n < 2) {
            return 0;
        }

        // dp 数组，dp[i][j][k]
        // j = 0, 1, 2
        // k = 0 表示当前不持股，dp[i][j][0] 表示到第 i + 1 天结束后，已经交易买入了 j - 1 次时，手中持有的最大现金数。
        // k = 1 表示当前持股，dp[i][j][1] 表示到第 i + 1 天结束后，已经交易买入了 j - 1 次时，持有的最大现金数，用负数表示。
        // i 只于 i - 1 有关，每次更新状态即可，可以直接优化掉
        int[][] dp = new int[3][2];

        // 明确初始条件
        // 截止第 1 天股市结束的时候，发生了一次交易买入并持股，花费最小现金数为第一天的股价，这是可能的
        dp[1][1] = -prices[0];
        // 截止第 1 天股市结束的时候，发生了两次交易买入并持股，这是不可能的，但是持股的时候花费的钱不可能为 0，必须为负数
        // 该负数必须小于一次交易买入时花费的最小现金数
        dp[2][1] = -prices[0] - 1;
        for (int i = 1; i < n; i++) {
            dp[1][1] = Math.max(dp[1][1], -prices[i]);
            dp[1][0] = Math.max(dp[1][0], dp[1][1] + prices[i]);
            dp[2][1] = Math.max(dp[2][1], dp[1][0] - prices[i]);
            dp[2][0] = Math.max(dp[2][0], dp[2][1] + prices[i]);
        }
        return Math.max(dp[1][0], dp[2][0]);
    }
}
