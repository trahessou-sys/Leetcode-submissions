void sortColors(int* nums, int numsSize) {
    int r=0;
    int b=0;
    int w=0;
    for(int k=0;k<numsSize;k++){
        int i=nums[k];
        if(i==0){r++;}
        else if(i==1){w++;}
        else if(i==2){b++;}
    }
    for(int i=0;i<numsSize;i++){
        if(i<r){nums[i]=0;}
        else if(i<r+w){nums[i]=1;}
        else{nums[i]=2;}
    }
}