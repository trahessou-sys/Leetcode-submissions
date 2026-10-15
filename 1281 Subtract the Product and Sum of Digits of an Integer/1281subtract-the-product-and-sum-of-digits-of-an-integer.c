int subtractProductAndSum(int n) {
    int k=n;
    int sum=0;
    int product=1;

    while(k>0){
        sum=sum+(k%10);
        product=product*(k%10);
        k=k/10;
    }

    return product-sum;
}