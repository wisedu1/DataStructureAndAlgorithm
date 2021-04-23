package offer.medium.no7;

import basestructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wisedu1
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preStart = 0, inEnd = inorder.length - 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        int preEnd = preorder.length -1, inStart =  0;
        return recursionBuildTree(preorder, inorder, preStart, preEnd, inStart, inEnd);
    }

    private TreeNode recursionBuildTree(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        TreeNode root = new TreeNode(preorder[preStart]);

        return null;
    }
}
