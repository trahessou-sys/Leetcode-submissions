class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int j=nums.length-1;
        while(k<=j){
            while((nums[k]==val && k<j)){
                int x =nums[j];
                nums[j]=nums[k];
                nums[k]=x;
                j--;
            }
            if(k==j && nums[k]==val){
                break;
            }
            k++;
        }
        return k;
        
    }
}