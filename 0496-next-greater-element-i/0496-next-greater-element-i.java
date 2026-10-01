class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextgreat = new int[nums2.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            map.put(nums2[i],i);
            if(i==nums2.length-1){
                nextgreat[i]=-1;
            }else{
                if(nums2[i+1]>nums2[i]){
                    nextgreat[i]=1;
                }else{
                    int k=1;
                    while(i+k<nums2.length && nextgreat[i+k]!=-1){
                        if(nums2[i+k]>nums2[i]){
                            nextgreat[i]=k;
                            break;
                        }
                        k+=nextgreat[i+k];
                    }
                    if(nums2[i+k]>nums2[i]){nextgreat[i]=k;}
                    else if(i+k>=nums2.length ||(nums2[i+k]<=nums2[i] && nextgreat[i+k]==-1)){nextgreat[i]=-1;}
                }
            }
        }
        int[] retour = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int p = map.get(nums1[i]);
            int d = nextgreat[p];
            retour[i] = (d == -1) ? -1 : nums2[p + d];
        }
        return retour;
    }
}