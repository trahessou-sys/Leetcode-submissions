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
    public List<Integer> postorderTraversal(TreeNode root) {
     List<Integer> retour = new ArrayList<>();
        postorder(root,retour);
        return retour;
    }

    public void postorder(TreeNode root, List<Integer> retour){
        if(root==null){return;}
        postorder(root.left,retour);
        postorder(root.right,retour);
        retour.add(root.val);
    }
}