/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = 0, rightDepth= 0;
        for(TreeNode p=root; p != null; p=p.left) ++leftDepth;
        for(TreeNode p=root; p != null; p=p.right) ++rightDepth;
        if (leftDepth==rightDepth) {
            return (1<< leftDepth) - 1 ;
        }
        else {
            return countNodes(root.left) + countNodes(root.right) + 1 ;
        }
    }
}