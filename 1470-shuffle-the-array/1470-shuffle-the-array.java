class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] retour= new int[2*n];
        for(int i=0;i<n;i++){
            retour[2*i]=nums[i];
            retour[2*i+1]=nums[n+i];
        }
        return retour;
    }
}