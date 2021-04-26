package offer.easy.no18;

import basestructure.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 *
 * @Author: wisedu1
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode newHead = head;
        while (head.next != null) {
            ListNode temp = head.next;
            if (head.next.val == val) {
                head.next = head.next.next;
            }
            head = temp;
        }
        return newHead;
    }
}
