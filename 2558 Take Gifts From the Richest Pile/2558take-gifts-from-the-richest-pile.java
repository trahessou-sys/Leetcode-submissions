class Solution {
    public long pickGifts(int[] gifts, int k) {
        int comp=0;
        while(comp<k){
            int indic=0;
            for(int i=0;i<gifts.length;i++){
                if(gifts[i]>gifts[indic]){
                    indic=i;
                }
            }
            gifts[indic]= (int) Math.sqrt(gifts[indic]);
            comp++;

        }  
        long retour=0;
        for(int i : gifts){retour+=i;}
        return retour;
        
    }
}