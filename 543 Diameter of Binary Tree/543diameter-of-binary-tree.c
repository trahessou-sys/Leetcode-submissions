/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
 int diam(struct TreeNode *root, int*p){
    if(root==NULL){
        return 0;
    }
    int l=diam(root->left,p);
    int r=diam(root->right,p);
    *p=(*p>l+r)? *p : l+r;

    return (l>r)? 1+l : 1+r;
}

int diameterOfBinaryTree(struct TreeNode* root) {
    int dia=0;
    diam(root,&dia);
    return dia;
}

