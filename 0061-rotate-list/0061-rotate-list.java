/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode comp=head;
        int n=1;
        while(comp.next!=null){
            n++;
            comp=comp.next;
        }

        k=k%n;
        if(k==0){return head;}

        ListNode tempo=head;
        for(int i=0;i<n-k-1;i++){
            tempo=tempo.next;
        }

        ListNode suiv=tempo.next;
        tempo.next=null;
        comp.next=head;
        head=suiv;
        return head;



    }
}