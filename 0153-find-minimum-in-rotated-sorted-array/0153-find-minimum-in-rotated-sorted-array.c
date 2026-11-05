int trouve(int *nums, int numsSize, int low, int high){
    if(low==high){return nums[low];}
    int mid = low+(high-low)/2;
    if(mid==0){return nums[0];}
    if(nums[mid]>nums[numsSize-1]){
        return trouve(nums,numsSize,mid+1,high);
    }else if(nums[mid-1]>nums[numsSize-1]){
        return nums[mid];
    }
    return trouve(nums,numsSize,low,mid);
}
int findMin(int* nums, int numsSize) {
    if(numsSize==1){return nums[0];}
    return trouve(nums,numsSize,0,numsSize);
}