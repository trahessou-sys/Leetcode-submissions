class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        char[] retour= new char[arr.length];
        int nbr=0;
        
        int i = arr.length - 1;
        while (i >= 0) {
            while (i >= 0 && arr[i] == ' ') {
                i--;
            }
            if (i < 0) break;

            int end = i;
            while (i >= 0 && arr[i] != ' ') {
                i--;
            }
            int start = i + 1;

            if (nbr > 0) {
                retour[nbr++] = ' ';
            }
            for (int k = start; k <= end; k++) {
                retour[nbr++] = arr[k];
            }
        }
        return new String(Arrays.copyOfRange(retour, 0, nbr));
    }
}