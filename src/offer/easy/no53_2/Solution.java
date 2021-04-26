package offer.easy.no53_2;

/**
 * @Author: wisedu1
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return length;
    }
}
