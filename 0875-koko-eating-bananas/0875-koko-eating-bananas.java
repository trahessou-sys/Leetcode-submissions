class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        long somme=0;
        for(int i:piles){
            if(i>max){max=i;}
            somme+=i;
        }
        
        int low = (int) ((somme + h - 1) / h); 
        return min(piles,h,low,max);
    }

    private int min(int[] piles, int h, int low, int high){
        if(low>high){return 0;}
        if(low==high){return low;}
        int mid = low +(high-low)/2;
        if(!valid(mid,piles,h)){
            return min(piles,h,mid+1,high);
        }
        return min(piles,h,low,mid);
    }

    private boolean valid(int k,int[] piles,int h){
        if (k <= 0) return false;            
        long heures = 0;                     
        for (int p : piles) {
            heures += (p + k - 1) / k;       
            if (heures > h) return false;    
        }
        return true;
    }
}