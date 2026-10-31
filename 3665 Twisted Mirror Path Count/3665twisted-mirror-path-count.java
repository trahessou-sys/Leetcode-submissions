class Solution {
    static final long MOD = 1_000_000_007;
    public int uniquePaths(int[][] grid) {
        long[][][] memo = new long[grid.length][grid[0].length][2];
        for (long[][] ligne : memo) {
            for (long[] cellule : ligne) {
                Arrays.fill(cellule, -1);
            }
        }
        return (int) paths(grid,0,0,0,memo); 
        
    }

    public long paths(int[][] grid, int i,int j,int dir,long[][][] memo){
        if(i>=grid.length || j>=grid[0].length){return 0;}
        if(i==grid.length-1 && j==grid[0].length-1){
            return 1;
        }
        if(memo[i][j][dir]!=-1){return memo[i][j][dir];}
        
        long res=0;
        if (grid[i][j] == 0) {
            long bas = 0, droite = 0;
            if (i < grid.length - 1)    { bas    = paths(grid, i + 1, j, 1, memo); }
            if (j < grid[0].length - 1) { droite = paths(grid, i, j + 1, 0, memo); }
            res = (bas + droite) % MOD;
        }else {
            res = 0;
            if (dir == 0 && i < grid.length - 1)    { res = paths(grid, i + 1, j, 1, memo); }
            if (dir == 1 && j < grid[0].length - 1) { res = paths(grid, i, j + 1, 0, memo); }
        }
        memo[i][j][dir]=res;
        return res;
    }
}