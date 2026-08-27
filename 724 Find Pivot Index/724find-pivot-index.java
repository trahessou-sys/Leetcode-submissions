class Solution {
    public int pivotIndex(int[] nums) {
        int sumleft=0;
        int sumright=0;
        for(int i=1;i<nums.length;i++){
            sumright+=nums[i];
        }
        if(sumleft==sumright){return 0;}

        for(int i=1;i<nums.length;i++){
            sumright-=nums[i];
            sumleft+=nums[i-1];
            if(sumleft==sumright){return i;}
        }

        return -1;
    }
}