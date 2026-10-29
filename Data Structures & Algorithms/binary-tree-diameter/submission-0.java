/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        int maxheight=Math.max(leftheight,rightheight)+1;
        return maxheight;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int D1=diameterOfBinaryTree(root.left);
        int D2=diameterOfBinaryTree(root.right);
        int D3 = height(root.left) + height(root.right);
        return (Math.max(D3,Math.max(D2,D1)));
    }
}
