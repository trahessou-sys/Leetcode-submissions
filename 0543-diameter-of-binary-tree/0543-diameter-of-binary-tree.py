# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    dia=0
    def diameterOfBinaryTree(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        self.diam(root)
        return self.dia
    
    def diam(self,root):
        if(root is None):
            return 0
        l=self.diam(root.left)
        r=self.diam(root.right)

        self.dia=max(self.dia,l+r)

        return 1+max(l,r)