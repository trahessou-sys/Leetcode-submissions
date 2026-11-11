"""
# Definition for a Node.
class Node(object):
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution(object):
    def levelOrder(self, root):
        """
        :type root: Node
        :rtype: List[List[int]]
        """
        r=[]
        if(root is None):
            return r
        q=deque()
        q.append(root)
        while q:
            t=[]
            k=len(q)
            for i in range(k):
                temp=q.popleft()
                t.append(temp.val)
                for j in temp.children:
                    if(not(j is None)):
                        q.append(j)
            r.append(t)
        return r
    
    