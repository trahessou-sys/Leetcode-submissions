/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findErrorNums(int* nums, int numsSize, int* returnSize) {
    *returnSize=2;
    int *retour=malloc(2*sizeof(int));
    int n=numsSize;
    long sum=0;
    long sumsq=0;
    for(int i=0;i<n;i++){
        sum+=nums[i];
        sumsq+=nums[i]*nums[i];
    }
    long a = sum- (n*(n+1))/2;
    long b = sumsq- ((long)n*(2*n+1)*(n+1))/6;
    long c =b/a;
    
    retour[1]=(int) (c-a)/2;
    retour[0]=(int) (c+a)/2;
    return retour;
    
    
}