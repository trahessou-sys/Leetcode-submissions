# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    r=0
    def goodNodes(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if(root is None):
            return 0
        self.good(root,root.val)
        return self.r
    
    def good(self,root,m):
        if(root is None):
            return
        if(m<=root.val):
            self.r+=1
        self.good(root.left,max(root.val,m))
        self.good(root.right,max(root.val,m))
        