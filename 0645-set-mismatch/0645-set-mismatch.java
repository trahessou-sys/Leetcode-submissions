class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] occu=new int[nums.length];
        int[] retour= new int[2];
        for(int i=0;i<nums.length;i++){
            occu[nums[i]-1]+=1;
            if(occu[nums[i]-1]==2){
                retour[0]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(occu[i]==0){retour[1]=i+1;}
        }
        return retour;
    }
}