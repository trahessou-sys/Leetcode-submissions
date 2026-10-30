int cmpLongLong(const void *a, const void *b) {
    long long x = *(const long long *)a;
    long long y = *(const long long *)b;
    return (x > y) - (x < y);       
}

long long rearange(int o) {
    int compte[10] = {0};          
    if (o == 0) compte[0] = 1;
    while (o > 0) {
        compte[o % 10]++;
        o /= 10;
    }
    long long resultat = 0;
    for (int c = 9; c >= 0; c--) {
        for (int k = 0; k < compte[c]; k++) {
            resultat = resultat * 10 + c;
        }
    }
    return resultat;
}

long long maximizeSum(int* nums, int numsSize, int k) {
    long long retour=0;
    long long *reaarange=calloc(numsSize,sizeof(long long));
    
    for(int i=0;i<numsSize;i++){
        retour+=nums[i];
        reaarange[i]=rearange(nums[i])-nums[i];
    }

    qsort(reaarange, numsSize, sizeof(long long), cmpLongLong);
    for(int i=0;i<k;i++){
        retour+=reaarange[numsSize-1-i];
    }
    free(reaarange);
    return retour;
}


        
       
        

     

   