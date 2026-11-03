int minMoves(int* nums, int numsSize) {
    int max=nums[0];
    int r=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]>max){max=nums[i];}
        r+=nums[i];
    }
    return numsSize*max-r;
}