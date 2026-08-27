class Solution {
    public int maxVowels(String s, int k) {
        int vowel=0;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowel++;
            }
        }
        int maxVowel=vowel;
        for(int i=k;i<s.length();i++){
            char g=s.charAt(i-k);
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowel++;
            }
            if(g=='a'||g=='e'||g=='i'||g=='o'||g=='u'){
                vowel--;
            }
            if(vowel>maxVowel){
                maxVowel=vowel;
            }
        }
        return maxVowel;
    }
}