class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){return nums[0];}
        return trouve(nums,0,nums.length);
    }

    private int trouve(int[] nums,int low, int high){
        if(low==high){return nums[low];}
        int mid = low+(high-low)/2;
        if(mid==0){return nums[0];}
        if(nums[mid]>nums[nums.length-1]){
            return trouve(nums,mid+1,high);
        }else{
            if(nums[mid-1]>nums[nums.length-1]){
                return nums[mid];
            }
        }
        return trouve(nums,low,mid);
    }
}