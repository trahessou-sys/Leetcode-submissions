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
    int min=-1;

    public int minDepth(TreeNode root) {
        if(root==null){return 0;}
        mind(root,1);
        return min;
    }

    public void mind(TreeNode root,int i){
        if(min!=-1 && i>min){return;}
        if(root.right==null && root.left==null){
            min = (min==-1)? i : Math.min(min,i);
            return;
        }
        if(root.right!=null){mind(root.right,i+1);}
        if(root.left!=null){mind(root.left,i+1);}
    }
}