class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<=nums[0]){return 0;}
        if(target>nums[nums.length-1]){return nums.length;}
        if(target==nums[nums.length-1]){return nums.length-1;}
        return searchDico(nums,target,0,nums.length);
    }

    public int searchDico(int[]nums, int target, int start, int end){
        int mid = (start+end)/2 ;
        if(nums[mid]==target){return mid;}
        else if(nums[mid]<target){
            if(mid<nums.length-1 && target<nums[mid+1]){return mid+1;}
            return searchDico(nums,target,mid,end);
        }
        else{
            if(mid>0 && nums[mid-1]<target){return mid;}
            return searchDico(nums,target,start,mid);
        }
    }
}