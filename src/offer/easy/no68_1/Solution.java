package offer.easy.no68_1;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/**
 * @Author: wisedu1
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.left == null || root.right == null) {
            return root;
        }
        if (p.val <= root.val && q.val >= root.val) {
            return root;
        }
        if (p.val >= root.val && q.val <= root.val) {
            return root;
        }
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return null;
    }
}
