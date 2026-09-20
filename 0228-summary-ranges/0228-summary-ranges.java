class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> retour = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int j=nums[i];
            while(i<nums.length-1 && nums[i+1]==nums[i]+1){
                i++;
            }
            if(nums[i]==j){retour.add(j+"");}
            else{retour.add(j+"->"+nums[i]);}
            i++;
        }
        return retour;
    }
}