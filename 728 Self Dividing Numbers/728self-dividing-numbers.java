class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> retour= new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(self(i)){
                retour.add(i);
            }
        }
        return retour;
    }

    public boolean self(int n){
        int nums=n;
        while(nums>0){
            int digits=nums%10;
            if(digits==0 || n%digits!=0){return false;}
            nums/=10;
        }
        return true;
    }
}