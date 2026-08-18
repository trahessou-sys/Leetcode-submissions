class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0;
        int k=flowerbed.length;
        for(int j=0;j<k;j++){
            if(flowerbed[j]==0){
                if(j==0 && k==1){
                    return true;
                }else if(j==0 && flowerbed[1]==0){
                    i+=1;
                    flowerbed[0]=1;
                }else if(j==k-1 && flowerbed[k-2]==0){
                    i+=1;
                    flowerbed[k-1]=1;
                }else if(j>0 && j<k-1 && flowerbed[j-1]==0 && flowerbed[j+1]==0){
                    i+=1;
                    flowerbed[j]=1;
                }
            }
            if(i>=n){
                return true;
            }
        }
       return false;
    }
}