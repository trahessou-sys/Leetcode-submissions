/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
int** generate(int numsRows, int* returnSize, int** returnColumnSizes) {
    *returnSize=numsRows;
    int *sizes=malloc(numsRows*sizeof(int));
    int **retour=malloc(numsRows*sizeof(int *));
    for(int i=0;i<numsRows;i++){
        sizes[i]=i+1;
        if(i==0){
            int *temp =malloc(sizeof(int));
            temp[0]=1;
            retour[0]=temp;
        }else{
            int *temp=malloc(sizes[i]*sizeof(int));
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){temp[j]=1;}
                else{temp[j]=retour[i-1][j]+retour[i-1][j-1];}
            }
            retour[i]=temp;
        }
    }
    *returnColumnSizes=sizes;
    return retour;
}