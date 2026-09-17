class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> retour = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();
            if(i==0){
                row.add(1);
                retour.add(row);
            }else if(i==1){
                row.add(1);
                row.add(1);
                retour.add(row);
            }
            else{
                for(int j=0;j<=i;j++){
                    if(j==0||j==i){row.add(1);}
                    else{row.add(retour.get(i-1).get(j)+retour.get(i-1).get(j-1));}
                }
                retour.add(row);
            }
        }
        return retour.get(rowIndex);
    }
}