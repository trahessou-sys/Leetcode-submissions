class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> idk= new HashSet<>();
        for(int i : nums){
            if(idk.contains(i)){return true;}
            else{idk.add(i);}
        }
        return false;
    }
}