/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* decompressRLElist(int* nums, int numsSize, int* returnSize) {
    int size=0;
    for(int i=0;i<numsSize/2;i++){
        size+=nums[2*i];
    }
    *returnSize=size;
    int *retour=malloc(size*sizeof(int));
    int k=0;
    for(int i=0;i<numsSize/2;i++){
        for(int j=0;j<nums[2*i];j++){
            retour[k++]=nums[2*i+1];
        }
    }
    return retour;
}