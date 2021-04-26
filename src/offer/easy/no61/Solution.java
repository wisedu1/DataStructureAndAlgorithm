package offer.easy.no61;

import java.util.Arrays;

/**
 * @Author: wisedu1
 */
class Solution {
    public boolean isStraight(int[] nums) {
        int n = 5;
        Arrays.sort(nums);
        int index = 0;
        while (nums[index] == 0 && index <= n - 1) {
            index++;
        }
        if (index == n - 1) {
            return true;
        }
        int left = index, right = index + 1;
        for (int i = index; i < n; i++) {
            while (right <= n - 1) {
                if (nums[left] == nums[right]) {
                    return false;
                }
                left++;
                right++;
            }
        }
        if (nums[n - 1] - nums[index] <= 4) {
            return true;
        }
        return false;
    }
}
