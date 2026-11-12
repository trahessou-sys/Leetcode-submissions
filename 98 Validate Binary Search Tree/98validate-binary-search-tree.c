/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool valide(struct TreeNode *node, long long mini, long long maxi) {
    if (node == NULL) return true;
    if (node->val <= mini || node->val >= maxi) return false;
    return valide(node->left, mini, node->val)
        && valide(node->right, node->val, maxi);
}

bool isValidBST(struct TreeNode* root) {
    return valide(root, LLONG_MIN, LLONG_MAX);
}