# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reorderList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: None Do not return anything, modify head in-place instead.
        """
        if(head is None or head.next is None):
            return
        cot=self.separer(head)
        cot=self.reverse(cot)
        head=self.fusion(head,cot)
    
    def separer(self,head):
        if(head is None or head.next is None):
            return head
        slow=head
        fast=head.next
        while(not(fast.next is None)):
            slow=slow.next
            fast=fast.next
            if(not(fast.next is None)):
                fast=fast.next
        temp=slow.next
        slow.next=None
        return temp
    
    def reverse(self,head):
        if(head is None or head.next is None):
            return head
        temp=head
        depla=head.next
        d=head.next
        temp.next=None
        while(not(d.next is None)):
            d=d.next
            depla.next=temp
            temp=depla
            depla=d
        
        depla.next=temp
        temp=depla
        depla=d
        return depla
    
    def fusion(self,l,t):
        d1=l
        d2=t
        r=l

        while( (not(d1 is None)) and (not(d2 is None)) ):
            d1=d1.next
            r.next=d2
            d2=d2.next
            r=r.next

            r.next=d1
            r=r.next
        
        return l
            
        