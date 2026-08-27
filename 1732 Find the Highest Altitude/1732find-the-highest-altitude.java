class Solution {
    public int largestAltitude(int[] gain) {
        int Alt=0;
        int maxAlt=0;
        for(int i : gain){
            Alt+=i;
            if(Alt>maxAlt){maxAlt=Alt;}
        }
        return maxAlt;
    }
}