package leetcode.medium.no538;

import basestructure.TreeNode;

/**
 * 题目描述：给出二叉搜索树的根节点，该树的节点值各不相同，请你将其转换为累加树 (Greater Sum Tree)，
 * 使得每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。
 */
public class Solution {
    TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

    // 记录累加和
    int sum = 0;

    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.right);
        // 维护累加和
        sum += (int) root.val;
        // 将 BST 转化成累加树
        root.val = sum;
        traverse(root.left);
    }
}
