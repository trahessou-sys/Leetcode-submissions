class Solution {
    public void moveZeroes(int[] nums) {
        int in=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int a=nums[i], b=nums[in];
                nums[i]=b;
                nums[in]=a;
                in++;
            }
        }

    }
}