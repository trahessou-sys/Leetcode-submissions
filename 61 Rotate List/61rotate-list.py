# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: Optional[ListNode]
        """
        if(head is None):
            return None
        
        comp=head
        n=1
        while(not(comp.next is None)):
            n+=1
            comp=comp.next
        
        k=k%n
        if(k==0):
            return head
        
        tempo=head
        for i in range(0,n-k-1):
            tempo=tempo.next
        
        suiv=tempo.next
        tempo.next=None
        comp.next=head
        head=suiv
        return head
        