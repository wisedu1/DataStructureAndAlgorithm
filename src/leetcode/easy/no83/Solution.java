package leetcode.easy.no83;

import basestructure.ListNode;

/**
 * 该题和 26 题一样，唯一区别在于把数组赋值操作变成操作指针而已。
 *
 * @author wisedu1
 */
public class Solution {
    ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode slow = head, fast = head;  // 快慢指针都从 head 开始搜寻

        // fast 指针的搜寻
        while (fast != null) {
            if (fast.val != slow.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }

        slow.next = null;  // 断开与后面重复的元素的连接
        return head; // 返回以 head 为头的 链表
    }
}
