bool valid(int *piles, int pilesSize, int k, int h){
    if(k<=0){return false;}
    long long heures =0;
    for(int i=0;i<pilesSize;i++){
        heures+= (piles[i]+k-1)/k;
        if(heures>h){return false;}
    }
    return true;
}

int minEatingSpeed(int* piles, int pilesSize, int h) {
    int max=0;
    long long somme =0;
    for(int i=0;i<pilesSize;i++){
        if(piles[i]>max){max=piles[i];}
        somme+=i;
    }

    int low = (int)((somme+h-1)/h);
    int high = max;

    while(low<high){
        int mid= low + (high-low)/2;
        if(!valid(piles,pilesSize,mid,h)){
            low=mid+1;
        }else{
            high=mid;
        }
    }
    return low;
}

