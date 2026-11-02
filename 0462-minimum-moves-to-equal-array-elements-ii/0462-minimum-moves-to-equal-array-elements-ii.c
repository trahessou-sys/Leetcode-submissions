int cmp_int(const void *a, const void *b) {
    int x = *(const int *)a;
    int y = *(const int *)b;
    return (x > y) - (x < y);   // returns -1, 0 or 1
}

int minMoves2(int* nums, int numsSize) {
    if(numsSize<=1){return 0;}
    int mid=numsSize/2;
    int moves=0;
    int temp=0;
    qsort(nums,numsSize,sizeof(int),cmp_int);
    for(int i=0;i<numsSize;i++){
        moves+=abs(nums[mid]-nums[i]);
        temp+=abs(nums[mid-1]-nums[i]);
    }
    return (moves<=temp)? moves : temp;
}