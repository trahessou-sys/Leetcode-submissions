/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize) {
    *returnSize =2*numsSize;
    int *retour = malloc(*returnSize * sizeof(int));
    for(int i=0;i<numsSize;i++){
        retour[i]=nums[i];
        retour[i+numsSize]=nums[i];
    }
    return retour;
}