class Solution {
    public long maximizeSum(int[] nums, int k) {
        long retour=0;
        long[] reaarange = new long[nums.length];
        for(int i=0;i<nums.length;i++){
            retour+=nums[i];
            reaarange[i]=rearange(nums[i])-nums[i];
        }
        Arrays.sort(reaarange);
        for(int i=0;i<k;i++){
            retour+=reaarange[nums.length-1-i];
        }

        return retour;
        
    }

    public long rearange(int o){
        int[] compte = new int[10];
        if (o == 0) compte[0] = 1;
        while (o > 0) {
            compte[o % 10]++;      
            o /= 10;               
        }
        long resultat = 0;
        for (int c = 9; c >= 0; c--) {
            for (int k = 0; k < compte[c]; k++) {
                resultat = resultat * 10 + c;
            }
        }
        return resultat;
    }
}