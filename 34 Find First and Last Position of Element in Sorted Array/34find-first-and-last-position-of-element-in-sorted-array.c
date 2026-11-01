/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

 int search(int *nums,int n, int target, int low, int high){
    while(low<high){
        int mid= low +(high-low)/2;
        if(nums[mid]==target && (mid==0 || nums[mid-1]<nums[mid])){return mid;}
        if(nums[mid]<target){
            low=mid+1;
        }else{
            high=mid;
        }
    }
    return -1;
}

int searchc(int *nums,int n, int target, int low, int high){
    while(low<high){
        int mid= low +(high-low)/2;
        if(nums[mid]==target && (mid==n-1 || nums[mid+1]>nums[mid])){return mid;}
        if(nums[mid]<=target){
            low=mid+1;
        }else{
            high=mid;
        }
    }
    return -1;
}

int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int *retour=calloc(2,sizeof(int));
    *returnSize=2;
    if((numsSize==0 || target<nums[0] || target>nums[numsSize-1])){
        retour[0]=-1;
        retour[1]=-1;
    }else{
        retour[0]=search(nums,numsSize,target,0,numsSize);
        retour[1]=searchc(nums,numsSize,target,0,numsSize);
    }
    return retour;
}

