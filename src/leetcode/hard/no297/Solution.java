package leetcode.hard.no297;

import basestructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目描述：二叉树的序列化与反序列化
 * @author wisedu1
 */
public class Solution {
    String SEP = ","; // 分割符
    String NULL = "#";  // 空的位置用 '#' 占位

    /**
     * 将二叉树序列化为字符串
     *
     * @param root
     * @return
     */
    String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder stringBuilder = new StringBuilder();
        // 初始化队列，将 root 加入队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();

            /* 层级遍历代码 */
            if (cur == null) {
                stringBuilder.append(NULL).append(SEP);
                continue;
            }
            stringBuilder.append(cur.val).append(SEP);

            queue.offer(root.left);
            queue.offer(root.right);
        }
        return stringBuilder.toString();
    }

    /**
     * 反序列化
     *
     * @param data
     * @return
     */
    TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;
        String[] nodes = data.split(SEP);
        // 第一个元素就是 root 的值
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));

        // 队列 q 记录父节点，将 root 加入队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for (int i = 1; i < nodes.length; ) {  // i 记录子节点的位置
            // 队列中存的都是父节点
            TreeNode parent = queue.poll();
            // 父节点对应的左侧子节点的值
            String left = nodes[i++];
            if (!left.equals(NULL)) {
                parent.left = new TreeNode(Integer.parseInt(left));
                queue.offer(parent.left);
            } else {
                parent.left = null;
            }
            // 父节点对应的右侧子节点的值
            String right = nodes[i++];
            if (!right.equals(NULL)) {
                parent.right = new TreeNode((Integer.parseInt(right)));
                queue.offer(parent.right);
            } else {
                parent.right = null;
            }
        }
        return root;

    }
}
