class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        int r=0;
        for(int i : nums){
            if(i>max){max=i;}
            r+=i;
        }   
        return nums.length*max-r;
    }
}