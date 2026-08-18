class Solution {
    public String mergeAlternately(String word1, String word2) {
        int long1=word1.length();
        int long2=word2.length();
        String word="";

        if(long1<=long2){
            for(int i=0;i<long1;i++){
                word+=""+word1.charAt(i)+word2.charAt(i);
            }
            for(int j=long1;j<long2;j++){
                word+=word2.charAt(j);
            }
        }else{
            for(int i=0;i<long2;i++){
                word+=""+word1.charAt(i)+word2.charAt(i);
            }
            for(int j=long2;j<long1;j++){
                word+=word1.charAt(j);
            }
        }

        return word;
    }
}