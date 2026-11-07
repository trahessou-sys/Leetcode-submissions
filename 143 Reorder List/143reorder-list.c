/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode *fusion(struct ListNode *l, struct ListNode *t){
    struct ListNode *d1=l;
    struct ListNode *d2=t;
    struct ListNode *r =l;

    while(d1!=NULL && d2!=NULL){
        d1=d1->next;
        r->next=d2;
        d2=d2->next;
        r=r->next;

        r->next=d1;
        r=r->next;
    }
    return l;
}

struct ListNode *reverse(struct ListNode *head){
    if(head==NULL || head->next==NULL){return head;}
    struct ListNode *temp=head;
    struct ListNode *depla=head->next;
    struct ListNode *d=head->next;
    temp->next=NULL;
    while(d->next!=NULL){
        d=d->next;
        depla->next=temp;
        temp=depla;
        depla=d;
    }
    depla->next=temp;
    temp=depla;
    depla=d;
    return depla;
 }


struct ListNode *separer(struct ListNode* head){
    if(head==NULL || head->next==NULL){return head;}
    struct ListNode *slow =head;
    struct ListNode *fast=head->next;
    while(fast->next!=NULL){
        slow=slow->next;
        fast=fast->next;
        if(fast->next!=NULL){
            fast=fast->next;
        }
    }
    struct ListNode *temp=slow->next;
    slow->next=NULL;
    return temp;
}


void reorderList(struct ListNode* head) {
    if(head==NULL || head->next==NULL){return;}
    struct ListNode *cot =separer(head);
    cot=reverse(cot);
    head=fusion(head,cot);
}