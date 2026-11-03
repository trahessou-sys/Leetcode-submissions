class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        Deque<Integer> file = new ArrayDeque<>();
        file.add(0);
        int prochain = 1;   
        int sauts = 0;

        while (!file.isEmpty()) {
            int taille = file.size();          
            sauts++;
            for (int k = 0; k < taille; k++) {
                int i = file.poll();
                int portee = Math.min(i + nums[i], n - 1);
                for (int j = prochain; j <= portee; j++) {
                    if (j == n - 1) return sauts;
                    file.add(j);
                }
                prochain = Math.max(prochain, portee + 1);
            }
        }
        return -1;
    }

    
}