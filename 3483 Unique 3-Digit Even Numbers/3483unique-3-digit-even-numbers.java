class Solution {
    public int totalNumbers(int[] nums) {
        Set<Integer> jsp= new HashSet<>();
        for(int uni=0;uni<nums.length;uni++){
            if(nums[uni]%2==0){
                for(int diz=0;diz<nums.length;diz++){
                    if(diz!=uni){
                        for(int cent=0;cent<nums.length;cent++){
                            if(cent!=diz && cent!=uni && nums[cent]!=0){
                                jsp.add(nums[cent]*100+nums[diz]*10+nums[uni]);
                            }
                        }
                    }
                }
            }
        }
        return jsp.size();
    }
}