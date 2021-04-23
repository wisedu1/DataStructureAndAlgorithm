package offer.easy.no6;

import basestructure.ListNode;

import java.util.Stack;

/**
 * @author wisedu1
 */
public class Solution {
    public int[] reversePrint(ListNode head) {
        if (head == null) return new int[]{};

        Stack<ListNode> nodeStack = new Stack<>();
        nodeStack.push(head);
        int count = 1;
        while (head.next != null) {
            nodeStack.push(head.next);
            head = head.next;
            count++;
        }

        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = nodeStack.pop().val;
        }
        return result;
    }
}
