/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
typedef struct Node{
    struct TreeNode *tree;
    struct Node *suiv;
}Node;

typedef struct{
    struct Node* head;
    struct Node *tail;
    int len;
}deque;

deque* creer_deque(){
    deque* p=malloc(sizeof(deque));
    p->head=NULL;
    p->tail=NULL;
    p->len=0;
    return p;
}

Node* creer_node(struct TreeNode* tree){
    Node *p=malloc(sizeof(Node));
    p->tree=tree;
    p->suiv=NULL;
    return p;
}

void add(deque* q, struct TreeNode* n){
    Node *temp=creer_node(n);
    if(q->len==0){
        q->head=temp;
        q->tail=temp;
    }else{
        q->tail->suiv=temp;
        q->tail=temp;
    }
    q->len++;
}

struct TreeNode* poll(deque* q){
    if (q->len == 0) return NULL;
    struct Node *temp=q->head;
    struct TreeNode *r=temp->tree;
    if(q->len==1){
        q->head=NULL;
        q->tail=NULL;
    }else{
        q->head=q->head->suiv;
    }
    q->len--;
    free(temp);
    return r;
}

bool isEmpty(deque *q) {
    return q->len == 0;
}

typedef struct {
    int *data;
    int len;
    int cap;
} Liste;

Liste* creer_liste() {
    Liste *l = malloc(sizeof(Liste));
    l->len = 0;
    l->cap = 4;
    l->data = malloc(l->cap * sizeof(int));
    return l;
}

void addl(Liste *l, int x) {
    if (l->len == l->cap) {
        l->cap *= 2;
        l->data = realloc(l->data, l->cap * sizeof(int));
    }
    l->data[l->len++] = x;
}



int* rightSideView(struct TreeNode* root, int* returnSize) {
    if(root==NULL){*returnSize = 0; return NULL;}
    Liste *r=creer_liste();
    deque *q=creer_deque();
    add(q,root);
    while(!isEmpty(q)){
        int k=q->len;
        for(int i=0;i<k;i++){
            struct TreeNode *temp=poll(q);
            if(i==k-1){addl(r,temp->val);}
            if(temp->left!=NULL){add(q,temp->left);}
            if(temp->right!=NULL){add(q,temp->right);}
        }
    }
    free(q);
    *returnSize = r->len;
    int *tab = r->data;
    free(r);
    return tab;
}