package leetcode.easy.no26;

/**
 * 题目描述：删除排序数组中的重复项
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须咋原地修改输入数组并使用 O(1) 额外空间的条件下完成。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * @author wisedu1
 */
public class Solution {
    int removeDuplicate(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int slow = 0, fast = 0;  // 快慢指针

        while (fast < nums.length) {  // 快指针最多到数组最右侧
            if (nums[fast] != nums[slow]) { // 当 fast 碰到和 slow 不同的元素时，slow 往前走，并且交换位置。
                slow++; //
                nums[slow] = nums[fast];
            }
            fast++;  // fast 一直往后走
        }
        return slow + 1;
    }
}
