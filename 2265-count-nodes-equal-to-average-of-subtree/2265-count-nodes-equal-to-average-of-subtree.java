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
    Map<TreeNode,int[]> map = new HashMap<>();

    public int averageOfSubtree(TreeNode root) {
        if(root==null){return 0;}
        int[] arbre=subtree(root);
        int a=0;
        if(arbre[1]/arbre[0]==root.val){
            a=1;
        }
        return a+averageOfSubtree(root.right)+averageOfSubtree(root.left);
        
    }

    //Nombre de arbres, somme de valeurs
    public int[] subtree(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        if(map.containsKey(root)){return map.get(root);}
        int[] sg = subtree(root.left);
        int[] sd=subtree(root.right);
        int[] tab=new int[]{sg[0]+sd[0]+1,sg[1]+sd[1]+root.val};
        map.put(root,tab);
        return tab;
    }
}