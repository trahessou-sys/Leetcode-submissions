# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        if(root is None):
            return None
        
        compa=(p.val-root.val)*(root.val-q.val)
        if(compa>=0):
            return root
        if(p.val-root.val>0):
            return self.lowestCommonAncestor(root.right,p,q)
        return self.lowestCommonAncestor(root.left,p,q)
        