# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSubtree(self, root, subRoot):
        """
        :type root: Optional[TreeNode]
        :type subRoot: Optional[TreeNode]
        :rtype: bool
        """
        if((root is None) and(subRoot is None)):
            return True
        if((root is None)^(subRoot is None)):
            return False
        if(root.val==subRoot.val and self.isTree(root,subRoot)):
            return True
        return self.isSubtree(root.right,subRoot) or self.isSubtree(root.left,subRoot)
    
    def isTree(self,root,subRoot):
        if((root is None) and (subRoot is None)):
            return True
        if((root is None)^(subRoot is None)):
            return False
        if(root.val!=subRoot.val):
            return False
        return self.isTree(root.right,subRoot.right) and self.isTree(root.left,subRoot.left)
        