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
    public boolean isPalindrome(ListNode head) {
        if(head==null){return true;}
        List<Integer> verif = new ArrayList<>();
        add(head,verif);
        return verif(head,verif);
    }

    public void add(ListNode head, List<Integer> r){
        if(head.next==null){
            r.add(head.val);
        }else{
            add(head.next,r);
            r.add(head.val);
        }
    }

    public boolean verif(ListNode head, List<Integer> r){
        if(r.isEmpty()){return true;}
        if(head.val!=r.remove(0)){return false;}
        return verif(head.next,r);
    }
}