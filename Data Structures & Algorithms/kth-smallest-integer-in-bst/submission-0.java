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
    public List<Integer>Inorder(TreeNode root,List<Integer>list){
        if(root==null){
            return list;
        }
        Inorder(root.left,list);
        list.add(root.val);
        Inorder(root.right,list);
        return list;

    }
    public int kthSmallest(TreeNode root, int k) {
        //List<Integer>list=Inorder(root,new ArrayList<>());
        return Inorder(root,new ArrayList<>()).get(k-1); 
        
    }
}
