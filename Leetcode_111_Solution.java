/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lefthei = minDepth(root.left);
        int righthei = minDepth(root.right);

        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return 1 + righthei;
        }
        if (root.right == null) {
            return 1 + lefthei;
        }

        int min = Math.min(lefthei, righthei) + 1;
        return min;
    }
}