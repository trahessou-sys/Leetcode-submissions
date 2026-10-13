class Solution {
    public int firstUniqChar(String s) {
        Set<Character> verif = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(verif.contains(s.charAt(i))){continue;}
            boolean ver = false;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    ver=true;
                    break;
                }
            }
            verif.add(s.charAt(i));
            if(!ver){return i;}
        }
        return -1;
    }
}