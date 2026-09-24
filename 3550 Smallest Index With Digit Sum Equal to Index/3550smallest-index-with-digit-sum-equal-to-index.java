class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){    
            int n=nums[i];     
            int somme = 0;
            while (n > 0) {
                somme += n % 10;      
                n /= 10;              
            }
            if(somme==i){return i;}
        }
        return -1;
    }
}