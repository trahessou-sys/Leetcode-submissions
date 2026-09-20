class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<=1){return false;}
        Set<Integer> verif = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k){
                verif.remove(nums[i-k-1]);
            }
            if(verif.contains(nums[i])){return true;}
            else{verif.add(nums[i]);}
            
        }
        return false;
        
    }
}