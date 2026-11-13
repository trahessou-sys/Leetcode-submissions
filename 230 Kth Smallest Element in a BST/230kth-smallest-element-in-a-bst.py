# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    r=0
    retour=0

    def kthSmallest(self, root, k):
        """
        :type root: Optional[TreeNode]
        :type k: int
        :rtype: int
        """
        self.r=0
        self.retour=0
        self.dfs(root,k)
        return self.retour
    
    def dfs(self,root,k):
        if(root is None):
            return
        if(self.r>k):
            return
        self.dfs(root.left,k)
        self.r+=1
        if(self.r==k):
            self.retour=root.val
        self.dfs(root.right,k)

        