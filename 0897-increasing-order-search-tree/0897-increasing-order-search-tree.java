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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> inor= new ArrayList<>();
        inord(root,inor);
        return construct(inor,0);
    }

    public void inord(TreeNode root, List<Integer> list){
        if(root==null){return;}
        inord(root.left,list);
        list.add(root.val);
        inord(root.right,list);
    }

    public TreeNode construct(List<Integer> list, int i){
        if(i==list.size()-1){return new TreeNode(list.get(i));}
        return new TreeNode(list.get(i),null,construct(list,i+1));
    }
}