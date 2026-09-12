class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> retour= new ArrayList<>();
        int i=0;
        while(i<target.length){
            int push= (i==0)? target[0] : target[i]-target[i-1];
            for(int j=0;j<push-1;j++){
                retour.add("Push");
                retour.add("Pop");
            }
            retour.add("Push");
            i++;
        }
        return retour;
    }
}