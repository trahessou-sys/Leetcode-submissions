class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> inter=new ArrayList<>();
        for(int i:nums1){
            if(map.containsKey(i)){map.put(i,map.get(i)+1);}
            else{map.put(i,1);}
        }
        for(int i:nums2){
            if(map.containsKey(i) && map.get(i)>0){
                inter.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int[] retour=new int[inter.size()];
        for(int i=0;i<inter.size();i++){
            retour[i]=inter.get(i);
        }
        return retour;
    }
}