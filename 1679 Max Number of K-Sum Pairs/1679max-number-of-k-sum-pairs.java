class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int retour=0;
        for(int i=0;i<nums.length;i++){
            int complement = k - nums[i];
            if (complement == nums[i]) {
                if (map.get(nums[i]) >= 2) {
                    retour++;
                    map.put(nums[i], map.get(nums[i]) - 2);
                }
            } else {
                if (map.get(nums[i]) > 0 && map.containsKey(complement) && map.get(complement) > 0) {
                    retour++;
                    map.put(nums[i], map.get(nums[i]) - 1);
                    map.put(complement, map.get(complement) - 1);
                }
            }
        }
        return retour;
    }
}