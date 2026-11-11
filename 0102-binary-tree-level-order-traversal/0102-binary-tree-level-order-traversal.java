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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> r=new ArrayList<>();
        if(root==null){
            return r;
        }
        remplir(root,0,r);
        return r;
    }

    private void remplir(TreeNode root,int lvl, List<List<Integer>> r){
        if(root==null){return;}
        if(r.size()<lvl+1){r.add(new ArrayList<Integer>());}
        r.get(lvl).add(root.val);
        remplir(root.left,lvl+1,r);
        remplir(root.right,lvl+1,r);
    }
}