/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

bool isTree(struct TreeNode* root, struct TreeNode* subRoot){
    if(root==NULL && subRoot==NULL){return true;}
    if((root==NULL)^(subRoot==NULL)){return false;}
    if(root->val != subRoot->val){return false;}
    return isTree(root->left,subRoot->left) && isTree(root->right,subRoot->right);
}


bool isSubtree(struct TreeNode* root, struct TreeNode* subRoot) {
    if(root==NULL && subRoot==NULL){return true;}
    if((root==NULL)^(subRoot==NULL)){return false;}
    if(root->val==subRoot->val && isTree(root->right,subRoot->right) && isTree(root->left,subRoot->left)){return true;}
    return isSubtree(root->right,subRoot) || isSubtree(root->left,subRoot);
}