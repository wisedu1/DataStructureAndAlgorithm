package leetcode.easy.no27;

/**
 * 题目描述：移除元素。给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * @author wisedu1
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;  // 快慢指针

        while (fast < nums.length) {
            if (nums[fast] != val) {  // nums[fast] 不等于 val 的时候，往前挪
                nums[slow] = nums[fast];
                slow++;
            }

            fast++;
        }
        return slow;
    }
}
