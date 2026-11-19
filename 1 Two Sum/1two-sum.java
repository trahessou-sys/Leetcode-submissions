class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> diff= new HashMap<>();
        int[] retour = new int[2];
        for(int i=0;i<nums.length;i++){
            if(!diff.containsKey(target-nums[i])){
                diff.put(nums[i],i);
            }else{
                retour[0]=i;
                retour[1]=diff.get(target-nums[i]);
                break;
            }
        }
        return retour;
    }
}