# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isValidBST(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: bool
        """
        def valide(node, mini, maxi):
            if node is None:
                return True
            if node.val <= mini or node.val >= maxi:
                return False
            return valide(node.left, mini, node.val) and valide(node.right, node.val, maxi)

        return valide(root, float('-inf'), float('inf'))
        