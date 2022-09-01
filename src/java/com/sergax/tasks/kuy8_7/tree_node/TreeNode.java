package com.sergax.tasks.kuy8_7.tree_node;

/**
 * @author: sergax
 * @date: 27.07.22
 * <p>
 * How deep is tree
 * 4 == 3
 * / \
 * 10   23 == 2
 * / \
 * 12   6 == 1
 * \
 * null == 0
 * <p>
 * response: 3
 */
public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
    }
}

class TreeDepthFinder {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(13);
        findDepthOfTree(treeNode);
    }

    static int findDepthOfTree(TreeNode treeNode) {
        if (treeNode == null) return 0;

        int leftMaxDepth = findDepthOfTree(treeNode.left);
        int rightMaxDepth = findDepthOfTree(treeNode.right);
        int max = Math.max(leftMaxDepth, rightMaxDepth);
        System.out.println(max);
        return max;
    }
}
