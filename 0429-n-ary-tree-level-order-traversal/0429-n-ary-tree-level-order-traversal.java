/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> r=new ArrayList<>();
        remplir(root,0,r);
        return r;
    }

    private void remplir(Node root,int lvl, List<List<Integer>> r){
        if(root==null){return;}
        if(r.size()<lvl+1){r.add(new ArrayList<Integer>());}
        r.get(lvl).add(root.val);
        for(Node i:root.children){
            remplir(i,lvl+1,r);
        }
    }
}