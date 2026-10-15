/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortedSquares(int* nums, int numsSize, int* returnSize) {
    *returnSize=numsSize;
    int i=0;
    int j=numsSize-1;
    int k=numsSize-1;
    int *retour=calloc(numsSize,sizeof(int));
    while(i<=j){
        if(abs(nums[i])<abs(nums[j])){
            retour[k]=nums[j]*nums[j];
            j--;
        }else{
            retour[k]=nums[i]*nums[i];
            i++;
        }
        k--;
    }
    return retour;
}