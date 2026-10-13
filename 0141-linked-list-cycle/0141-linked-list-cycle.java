/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){return false;}
        return hasCycle(head,head.next);
    }

    public boolean hasCycle(ListNode slow, ListNode fast){
        if(fast==null || slow==null){return false;}
        if(slow==fast){return true;}
        if(fast.next==null){return false;}
        return hasCycle(slow.next,fast.next.next);
    }
}