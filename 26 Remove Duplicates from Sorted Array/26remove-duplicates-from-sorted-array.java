class Solution {
    public int removeDuplicates(int[] nums) {
       int po=1;
       for(int i : nums){
            if(i>nums[po-1]){
                nums[po]=i;
                po++;
            }
       }
       return po;
        
    }
}