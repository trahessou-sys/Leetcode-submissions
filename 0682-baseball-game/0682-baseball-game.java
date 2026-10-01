class Solution {
    public int calPoints(String[] operations) {
        List<Integer> score =new ArrayList<>();
        for(String i : operations){
            if(!i.equals("+") && !i.equals("D") && !i.equals("C")){
                score.add(Integer.parseInt(i));
            }else if(i.equals("+")){
                score.add(score.get(score.size()-1)+score.get(score.size()-2));
            }else if(i.equals("D")){
                score.add(2*score.get(score.size()-1));
            }else if(i.equals("C")){
                score.remove(score.size()-1);
            }
        }
        int x=0;
        for(int i : score){x+=i;}
        return x;
    }
}