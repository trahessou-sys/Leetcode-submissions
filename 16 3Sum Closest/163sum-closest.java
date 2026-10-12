class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int ecart=-1;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sumum= nums[i]+nums[j]+nums[k];
                if(sumum==target){return sumum;}
                else if(ecart==-1 || Math.abs(sumum-target)<ecart){sum=sumum;
                ecart=Math.abs(sumum-target);}
                if(sumum>target){k--;}
                else{j++;}
            }
        }
        return sum;
    }
}