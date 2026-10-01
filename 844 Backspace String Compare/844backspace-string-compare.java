class Solution {
    public boolean backspaceCompare(String s, String t) {
        List<Character> s1= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                s1.add(s.charAt(i));
            }else if(!s1.isEmpty()){
                s1.remove(s1.size()-1);
            }
        }

        List<Character> t1= new ArrayList<>();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                t1.add(t.charAt(i));
            }else if(!t1.isEmpty()){
                t1.remove(t1.size()-1);
            }
        }

        if(t1.size()!=s1.size()){return false;}
        for(int i=0;i<t1.size();i++){
            if(!t1.get(i).equals(s1.get(i))){return false;}
        }
        return true;
    }
}