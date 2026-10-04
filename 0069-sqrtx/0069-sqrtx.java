class Solution {
    public int mySqrt(int x) {
        if(x<=1){return x;}
        return ssqrt(x,0,x);
    }

    public int ssqrt(int x, int i, int j){
        int mid=i + (j-i)/2;
        long m = mid;                      
        if (m * m == x || (m * m < x && (m + 1) * (m + 1) > x)) { return mid; }
        if (m * m < x) { return ssqrt(x, mid, j); }
        else { return ssqrt(x, i, mid); }
    }
}