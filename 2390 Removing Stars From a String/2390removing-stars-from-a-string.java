class Solution {
    public String removeStars(String s) {
        List<Character> retour = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            add(s.charAt(i),retour);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : retour) {
            sb.append(c);
        }
        String result = sb.toString();
        return result;
    }

    public void add(char c, List<Character> liste){
        if(c!='*'){
            liste.add(c);
        }else{
            if(!liste.isEmpty()){
                liste.remove(liste.size()-1);
            }
        }
    }
}