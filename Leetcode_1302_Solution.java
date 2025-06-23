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
    int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        int maxdepth = maxdepth(root);
        findsum(root, 1, maxdepth);
        return sum;
    }

    public int maxdepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(maxdepth(node.left), maxdepth(node.right));
    }

    public void findsum(TreeNode node, int curr, int depth) {
        if (node != null) {
            if (curr == depth) {
                sum += node.val;
            }
            findsum(node.left, curr + 1, depth);
            findsum(node.right, curr + 1, depth);
        }
    }
}