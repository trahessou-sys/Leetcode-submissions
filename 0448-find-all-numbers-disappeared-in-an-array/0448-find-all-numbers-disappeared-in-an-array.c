/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDisappearedNumbers(int* nums, int numsSize, int* returnSize) {
    int *occu = calloc(numsSize,sizeof(int));
    int vus=0;
    for(int i=0;i<numsSize;i++){
        if(occu[nums[i]-1]==0){vus++;}
        occu[nums[i]-1]++;
    }
    *returnSize=numsSize-vus;
    int *retour=malloc(*returnSize*sizeof(int));
    int k=0;
    for(int i=0;i<numsSize;i++){
        if(occu[i]==0){
            retour[k++]=i+1;
        }
    }
    return retour;
}