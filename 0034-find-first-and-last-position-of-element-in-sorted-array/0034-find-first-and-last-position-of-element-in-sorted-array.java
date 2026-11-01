class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] retour=new int[2];
        if(nums.length==0 || target<nums[0] || target>nums[nums.length-1]){
            retour[0]=-1;
            retour[1]=-1;
        }else{
            retour[0]=search(nums,target,0,nums.length);
            retour[1]=searchc(nums,target,0,nums.length);
        }
        return retour;
    }

    private int search(int[] nums, int target, int low, int high){
        if(low>=high){return -1;}
        int mid=low +(high-low)/2;
        if(nums[mid]==target && (mid==0 || nums[mid-1]<nums[mid])){return mid;}
        if(nums[mid]<target){return search(nums,target,mid+1,high);}
        return search(nums,target,low,mid);
    }

    private int searchc(int[] nums, int target, int low, int high){
        if(low>=high){return -1;}
        int mid=low +(high-low)/2;
        if(nums[mid]==target && (mid==nums.length-1 || nums[mid+1]>nums[mid])){return mid;}
        if(nums[mid]<=target){return searchc(nums,target,mid+1,high);}
        return searchc(nums,target,low,mid);
    }
}