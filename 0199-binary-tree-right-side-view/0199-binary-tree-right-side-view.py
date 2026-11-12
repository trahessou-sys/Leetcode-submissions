# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def rightSideView(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]
        """
        r=[]
        if(root is None):
            return r
        q=deque()
        q.append(root)
        while q:
            k=len(q)
            for i in range(k):
                temp=q.popleft()
                if(i==k-1):
                    r.append(temp.val)
                if(not(temp.left is None)):
                    q.append(temp.left)
                if(not(temp.right is None)):
                    q.append(temp.right)
        return r
        