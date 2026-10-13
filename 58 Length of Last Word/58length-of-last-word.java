class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){return 0;}
        int i=s.length()-1;
        while(!(('a'<=s.charAt(i) && s.charAt(i)<='z')||('A'<=s.charAt(i) && s.charAt(i)<='Z'))){
            i--;
        }
        int j=i;
        while( 0<=i && (('a'<=s.charAt(i) && s.charAt(i)<='z')||('A'<=s.charAt(i) && s.charAt(i)<='Z'))){
            i--;
        }
        return j-i;
    }
}