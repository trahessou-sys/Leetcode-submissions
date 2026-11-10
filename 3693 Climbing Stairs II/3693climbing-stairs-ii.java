class Solution {
    int[] memo;
    public int climbStairs(int n, int[] costs) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return climb(0, n, costs);
    }

    int climb(int i, int n, int[]costs){
        if (i == n) {
            return 0;
        }
        if (memo[i] != -1) {
            return memo[i];
        }

        int minCost = Integer.MAX_VALUE;

        for (int j = i + 1; j <= Math.min(n, i + 3); j++) {
            int cost = climb(j, n, costs)+ costs[j - 1]+ (j - i) * (j - i);
            minCost = Math.min(minCost, cost);
        }
        memo[i] = minCost;
        return memo[i];
    }
}