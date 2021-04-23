package leetcode.medium.no230;

import basestructure.TreeNode;

/**
 * 题目描述：给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 * 你可以假设 k 总是有效的，1 <= k <= 二叉树搜索树元素个数。
 *
 * @author wisedu1
 */
public class solution {
    int kthSmallest(TreeNode root, int k) {
        // 利用 BST 的中序遍历特性
        traverse(root, k);
        return res;
    }

    // 记录结果
    int res = 0;
    // 记录当前元素的排名
    int rank = 0;

    void traverse(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        traverse(root.left, k);
        /* 中序代码位置 */
        rank++;
        if (k == rank) {
            // 找到第 k 小的元素
            res = (int) root.val;
            return;
        }
        traverse(root.right, k);
    }
}
