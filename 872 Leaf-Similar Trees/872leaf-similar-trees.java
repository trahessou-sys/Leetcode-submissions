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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> f1= new ArrayList<>();
        ArrayList<Integer> f2= new ArrayList<>();
        getfeuille(root1,f1);
        getfeuille(root2,f2);
        if(f1.size()!=f2.size()){return false;}
        for(int i=0;i<f1.size();i++){
            if((int)f1.get(i)!=(int)f2.get(i)){return false;}
        }
        return true;

    }

    public void getfeuille(TreeNode root, ArrayList<Integer> f){
        if(root.left!=null){getfeuille(root.left,f);};
        if(root.right==null && root.left==null){
            f.add(root.val);
        }
        if(root.right!=null){getfeuille(root.right,f);}
    }
}