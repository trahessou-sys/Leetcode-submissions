/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int r=0;
int max(int a,int b){
    return (a>b)? a: b;
}

void good(struct TreeNode *root,int maxi){
    if(root==NULL){return;}
    if(maxi<=root->val){r++;}
    good(root->left,max(maxi,root->val));
    good(root->right,max(maxi,root->val));
}

int goodNodes(struct TreeNode* root){
    r=0;
    good(root,root->val);
    return r;
}