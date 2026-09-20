class NumArray {
    int[] sums;

    public NumArray(int[] nums) {
        this.sums=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            this.sums[i]=sum;
        }
    }
    
    public int sumRange(int left, int right) {
        int reste=(left==0)? 0 : this.sums[left-1];
        return this.sums[right]-reste;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */