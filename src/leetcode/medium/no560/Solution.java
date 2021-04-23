package leetcode.medium.no560;

import java.util.HashMap;

/**
 * 题目描述：给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
 * @author wisedu1
 */
public class Solution {

    /**
     * 穷举
     *
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;  // 数组长度

        // 构造前缀和
        int[] sum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }

        int ans = 0;  // 记录答案

        // 穷举所有子数组
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // sum of nums[j..i-1]
                if (sum[i] - sum[j] == k)
                    ans++;
            }
        }

        return ans;
    }

    /**
     * 优化解法
     */
    public int subarraySum2(int[] nums, int k) {
        int n = nums.length;  // 数组长度

        // 记录前缀和 -> 该前缀和出现的次数
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);  // base case;

        int ans = 0, sum0_i = 0;  // 记录答案，以及当前前缀和

        for (int i = 0; i < n; i++) {
            sum0_i += nums[i];
            int sum0_j = sum0_i - k;  // 这是我们要找的前缀和 nums[0..j]
            // 如果前面有这个前缀和，则直接更新答案
            if (preSum.containsKey(sum0_j))
                ans += preSum.get(sum0_j);
            // 把前缀和 nums[0..i] 加入并记录出现次数
            preSum.put(sum0_i, preSum.getOrDefault(sum0_i, 0) + 1);
        }

        return ans;
    }
}
