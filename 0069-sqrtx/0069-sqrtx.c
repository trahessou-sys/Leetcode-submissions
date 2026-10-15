int ssqrt(int x, int low, int high){
    int mid=low + (high-low)/2;
    long m =(long)mid*mid;
    if(m==x){return mid;}
    else if(m<x && (long)(mid+1)*(mid+1)>x){
        return mid;
    }else if(m<x){
        return ssqrt(x,mid+1,high);
    }else{
        return ssqrt(x,low,mid-1);
    }
}

int mySqrt(int x) {
    if(x==0){return 0;}
    return ssqrt(x,0,x);
}

