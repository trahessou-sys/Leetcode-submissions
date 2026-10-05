class Solution {
    public int scoreOfParentheses(String s) {
        int score=0;
        List<Integer> pile = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                pile.add(score);
                score=0;
            }else{
                score=pile.remove(pile.size()-1)+Math.max(score*2,1);
            }
        }
        return score;
    }
}