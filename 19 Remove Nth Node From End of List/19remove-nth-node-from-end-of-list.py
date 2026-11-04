# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        if(head.next is None):
            return None
        prev=head
        suiv=head.next

        for i in range(1,n):
            suiv=suiv.next
        
        if(suiv is None):
            return head.next
        
        while(not (suiv.next is None)):
            suiv=suiv.next
            prev=prev.next
        
        prev.next=prev.next.next
        return head
