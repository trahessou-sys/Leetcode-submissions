/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     struct Node *next;
 *     struct Node *random;
 * };
 */
typedef struct {
    struct Node *key;   
    struct Node *value;  
    UT_hash_handle hh;
} Entry;

struct Node* copyf(struct Node* head, Entry** map) {
    if (head == NULL) return NULL;

    Entry* found;
    HASH_FIND_PTR(*map, &head, found);   
    if (found != NULL) return found->value;

    struct Node* r = malloc(sizeof(struct Node));
    r->val = head->val;
    r->next = NULL;
    r->random = NULL;

    Entry* e = malloc(sizeof(Entry));   
    e->key = head;
    e->value = r;
    HASH_ADD_PTR(*map, key, e);

    r->next = copyf(head->next, map);
    r->random = copyf(head->random, map);
    return r;
}


struct Node* copyRandomList(struct Node* head) {
    Entry* map = NULL;
    struct Node* res = copyf(head, &map);

    Entry *cur, *tmp;
    HASH_ITER(hh, map, cur, tmp) {
        HASH_DEL(map, cur);
        free(cur);
    }
    return res;
}