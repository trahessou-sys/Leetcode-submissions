/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {
    if(head==NULL){return NULL;}
    struct ListNode *comp=head;
    int n=1;
    while(comp->next!=NULL){
        n++;
        comp=comp->next;
    }

    k=k%n;
    if(k==0){return head;}

    struct ListNode *tempo=head;
    for(int i=0;i<n-k-1;i++){
        tempo=tempo->next;
    }

    struct ListNode *suiv=tempo->next;
    tempo->next=NULL;
    comp->next=head;
    head=suiv;
    return head;
}