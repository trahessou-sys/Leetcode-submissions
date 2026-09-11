class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> retour= new ArrayList<>();
        int[] occu=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            occu[nums[i]-1]+=1;
        }
        for(int i=1;i<=nums.length;i++){
            if(occu[i-1]==0){
                retour.add(i);
            }
        }
        return retour;
    }
}