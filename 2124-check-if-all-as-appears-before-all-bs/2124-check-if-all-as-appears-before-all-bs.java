class Solution {
    public boolean checkString(String s) {
        boolean trouve=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){trouve=true;}
            else if(s.charAt(i)=='a' && trouve){return false;}
        }
        return true;
    }
}