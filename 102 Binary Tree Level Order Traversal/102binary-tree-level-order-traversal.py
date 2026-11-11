# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def levelOrder(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[List[int]]
        """
        r=[]
        self.remplir(root,0,r)
        return r
    
    def remplir(self,root,lvl,r):
        if(root is None):
            return
        if(len(r)<lvl+1):
            r.append([])
        r[lvl].append(root.val)
        self.remplir(root.left,lvl+1,r)
        self.remplir(root.right,lvl+1,r)
        