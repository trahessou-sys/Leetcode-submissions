/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){return null;};
        long compa=((long)p.val-root.val)*((long)root.val-q.val);
        if(compa>=0){return root;}
        else{
            if(p.val-root.val>0){
                return lowestCommonAncestor(root.right,p,q);
            }else{
                return lowestCommonAncestor(root.left,p,q);
            }
        }
    }
}