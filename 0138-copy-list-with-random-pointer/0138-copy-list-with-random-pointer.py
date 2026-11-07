"""
# Definition for a Node.
class Node:
    def __init__(self, x, next=None, random=None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution(object):
    def copyRandomList(self, head):
        """
        :type head: Node
        :rtype: Node
        """
        dic={}
        return self.copyf(head,dic)
    
    def copyf(self,head,mapi):
        if(head is None):
            return None
        if(head in mapi):
            return mapi[head]
        r=Node(head.val)
        mapi[head]=r
        r.next=self.copyf(head.next,mapi)
        r.random=self.copyf(head.random,mapi)

        return r
        