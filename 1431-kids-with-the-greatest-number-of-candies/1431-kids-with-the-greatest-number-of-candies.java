class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n =candies.length;
        int[] candy=new int[n];
        int max=candies[0];
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            candy[i]=candies[i]+extraCandies;
            if(candies[i]>=max){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if(candy[i]>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}