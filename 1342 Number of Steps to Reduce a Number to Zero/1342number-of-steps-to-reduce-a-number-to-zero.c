int numberOfSteps(int num) {
    int step=0;
    int k=num;
    while(k>0){
        if(k%2==0){
            k=k/2;
        }else{
            k=k-1;
        }
        step=step+1;
    }
    return step;
}