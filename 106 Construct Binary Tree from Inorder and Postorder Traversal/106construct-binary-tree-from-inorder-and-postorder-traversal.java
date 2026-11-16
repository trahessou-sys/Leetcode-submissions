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
    HashMap<Integer,Integer> map;
    int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map=new HashMap<>();
        index=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return construct(postorder,0,inorder.length-1);
    }

    public TreeNode construct(int[] postorder,int low, int high){
        if(low>high){return null;}
        int val=postorder[index--];

        TreeNode node=new TreeNode(val);

        int inod=map.get(val);

        node.right=construct(postorder,inod+1,high);
        node.left=construct(postorder,low,inod-1);
        
        return node;


    }
}