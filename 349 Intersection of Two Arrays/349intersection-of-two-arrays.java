class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> o1=new HashSet<>();
        Set<Integer> o2=new HashSet<>();
        Set<Integer> o3=new HashSet<>();
        for(int i : nums1){o1.add(i);}
        for(int i : nums2){o2.add(i);}
        for(int i : o1){if(o2.contains(i)){o3.add(i);}}
        int[] retour = new int[o3.size()];
        int j=0;
        for(int i:o3){
            retour[j++]=i;
        }
        return retour;
    }
}