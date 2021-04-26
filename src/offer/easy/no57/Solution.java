package offer.easy.no57;

/**
 * @Author: wisedu1
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
                continue;
            }
            if (nums[left] + nums[right] == target) {
                return new int[]{nums[left], nums[right]};
            }
            if (nums[left] + nums[right] > target) {
                right--;
            }
            if (nums[left] + nums[right] < target) {
                left++;
            }
        }
        return null;
    }
}
