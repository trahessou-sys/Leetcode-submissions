class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid= nums.length/2;
        int moves=0;
        for(int i : nums){
            moves+=Math.abs(nums[mid]-i);
        }
        int temp =0;
        if(nums.length%2==0){
            for(int i : nums){
                temp+=Math.abs(nums[mid-1]-i);
            }
        }
        return (temp==0)? moves : Math.min(temp,moves);
    }
}