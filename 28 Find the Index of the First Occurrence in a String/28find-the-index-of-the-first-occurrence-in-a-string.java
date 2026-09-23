class Solution {
    public int strStr(String haystack, String needle) {
    int n = haystack.length();
    int m = needle.length();
    for (int debut = 0; debut + m <= n; debut++) {
        int j = 0;
        while (j < m && haystack.charAt(debut + j) == needle.charAt(j)) {
            j++;
        }
        if (j == m) {
            return debut;
        }
    }
    return -1;
}
}