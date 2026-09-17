class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){return;}
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }
        int[] nums=new int[m+n];
        int one=0;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                nums[one++]=nums1[i++];
            }else{
                nums[one++]=nums2[j++];
            }
        }
        while(i<m){
            nums[one++]=nums1[i++];
        }
        while(j<n){
            nums[one++]=nums2[j++];
        }
        for(int k=0;k<m+n;k++){
            nums1[k]=nums[k];
        }
       
    }

   
}