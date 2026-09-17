class Solution {
    public int majorityElement(int[] nums) {
        int x=0;
        int counter=0;
        for(int i=0;i<nums.length;i++){
            if(counter==0){
                x=nums[i];
                counter=1;
            }else if(x==nums[i]){
                counter++;
            }else if(x!=nums[i]){
                counter--;
            }
        }
        return x;
    }
}