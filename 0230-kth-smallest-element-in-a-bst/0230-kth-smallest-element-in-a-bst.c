/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int r=0;
int retour=-1;

void dfs(struct TreeNode* root,int k){
    if(root==NULL){return;}
    if(r>k){return;}
    dfs(root->left,k);
    r++;
    if(r==k){
        retour=root->val;
    }
    dfs(root->right,k);

}

int kthSmallest(struct TreeNode* root, int k) {
    r=0;
    retour=-1;
    dfs(root,k);
    return retour;
}