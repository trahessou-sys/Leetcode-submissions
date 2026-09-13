class Solution {
    public int[] finalPrices(int[] prices) {
        int[] retour=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            boolean ouii=false;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    retour[i]=prices[i]-prices[j];
                    ouii=true;
                    break;
                }
            }
            if(!ouii){retour[i]=prices[i];}
        }
        return retour;
    }
}