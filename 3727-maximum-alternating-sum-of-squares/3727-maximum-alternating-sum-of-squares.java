class Solution {
    public long maxAlternatingSum(int[] nums) {
        //Tri par valeurs absolue
       heapSort(nums);

        int i=0;
        int j=nums.length-1;
        long sum=0;
        while(j>=i){
            if(j>i){
                sum+=(long) nums[j]*nums[j]- (long) nums[i]*nums[i];
            }else{
                sum+=nums[j]*nums[j];
            }
            j--;
            i++;
        }
        return sum;


    }

    public static void heapSort(int[] nums) {
        int n = nums.length;
 
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(nums, i, n);
        }
 
        for (int end = n - 1; end > 0; end--) {
            swap(nums, 0, end);
            siftDown(nums, 0, end);
        }
    }
 
    private static void siftDown(int[] nums, int i, int size) {
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int largest = i;
 
            if (left < size && Math.abs(nums[left]) > Math.abs(nums[largest])) {
                largest = left;
            }
            if (right < size && Math.abs(nums[right]) > Math.abs(nums[largest])) {
                largest = right;
            }
            if (largest == i) return;
 
            swap(nums, i, largest);
            i = largest;
        }
    }
 
    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}