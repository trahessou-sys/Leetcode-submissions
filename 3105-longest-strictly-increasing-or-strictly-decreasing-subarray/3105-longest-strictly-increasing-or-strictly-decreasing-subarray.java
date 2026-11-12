class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxin=1;
        int maxde=1;
        int i=0;
        int j=0;
        while(j<nums.length-1){
            if(nums[j+1]>nums[j]){
                j++;
                if(j-i+1>maxin){
                    maxin=j-i+1;
                }
            }else{
                i=j+1;
                j++;
            }
        }
        i=0;
        j=0;
        while(j<nums.length-1){
            if(nums[j+1]<nums[j]){
                j++;
                if(j-i+1>maxde){
                    maxde=j-i+1;
                }
            }else{
                i=j+1;
                j++;
            }
        }
        return Math.max(maxin,maxde);
    }
}