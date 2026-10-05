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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> retour = new ArrayList<>();
        if(root==null){return retour;}
        path(root,retour,"");
        return retour;
    }

    public void path(TreeNode root, List<String> retour, String s){
        if(root==null){return;}
        if(root.right==null && root.left==null){
            retour.add(s+root.val);
            return;
        }
        path(root.left,retour,s+root.val+"->");
        path(root.right,retour,s+root.val+"->");

    }
}