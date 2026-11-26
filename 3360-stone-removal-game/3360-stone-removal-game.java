class Solution {
    public boolean canAliceWin(int n) {
       boolean r=false;
       int k=n;
       int i=10;
       while(k>=i){
        r=!r;
        k-=i;
        i--;
       }
       return r;
    }
}