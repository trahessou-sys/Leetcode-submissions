class Solution {
    public int equalPairs(int[][] grid) {
        
        int retour=0;

        for(int i=0;i<grid.length;i++){ //lignes

            for(int j=0;j<grid.length;j++){ //colonnes

            retour+=comparer(i,j,grid);
                
            }
        }
        return retour;
    }

    public int comparer(int i,int j,int[][] grid){
        for(int k=0;k<grid.length;k++){
            if(grid[i][k]!=grid[k][j]){
                return 0;
            }
        }
        return 1;
    }
}