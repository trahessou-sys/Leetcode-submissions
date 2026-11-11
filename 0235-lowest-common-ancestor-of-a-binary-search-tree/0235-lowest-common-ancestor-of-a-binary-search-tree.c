/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

struct TreeNode* lowestCommonAncestor(struct TreeNode* root, struct TreeNode* p, struct TreeNode* q) {
    if(root==NULL){return NULL;}
    long long compa=((long long)p->val-root->val)*((long long)root->val-q->val);
    if(compa>=0){return root;}
    if(p->val-root->val>0){
        return lowestCommonAncestor(root->right,p,q);
    }
    return lowestCommonAncestor(root->left,p,q);
}