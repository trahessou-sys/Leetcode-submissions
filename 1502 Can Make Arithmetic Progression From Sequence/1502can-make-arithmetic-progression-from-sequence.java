class Solution {
    public boolean canMakeArithmeticProgression(int[] tableau) {
        int n = tableau.length;

        for (int i = 1; i < n; i++) {
            int cle = tableau[i];
            int j = i - 1;

            while (j >= 0 && tableau[j] > cle) {
                tableau[j + 1] = tableau[j];
                j--;
            }
            tableau[j + 1] = cle;
        }

        int a=Math.abs(tableau[0]-tableau[1]);
        for(int i=1;i<n-1;i++){
            if(Math.abs(tableau[i]-tableau[i+1])!=a){
                return false;
            }
        }
        return true;
    }
}