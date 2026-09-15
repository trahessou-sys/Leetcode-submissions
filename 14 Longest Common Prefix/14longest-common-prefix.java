class Solution {
    public String longestCommonPrefix(String[] strs) {
        List<Character> pref= new ArrayList<>();
        for(int i=0;i<strs[0].length();i++){
            char c = strs[0].charAt(i);
            boolean bon = true;
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=c){
                    bon=false;
                    break;
                }
            }
            if(bon){
                pref.add(c);
            }else{
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char d : pref) {
            sb.append(d);
        }
        return sb.toString();
    }
}