/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    if(head->next==NULL){return NULL;}
    struct ListNode *prev=head;
    struct ListNode *suiv=prev->next;

    for(int i=1;i<n;i++){
        suiv=suiv->next;
    }

    if(suiv==NULL){return head->next;}

    while(suiv->next!=NULL){
        suiv=suiv->next;
        prev=prev->next;
    }
    prev->next=prev->next->next;
    return head;
}