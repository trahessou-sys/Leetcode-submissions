class Solution {
    public int[] plusOne(int[] digits) {
        int[] retour=new int[digits.length];
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            int incre=digits[i]+carry;
            if(incre>=10){
                retour[i]=incre%10;
                carry=1;
            }else{
                retour[i]=incre;
                carry=0;
            }
        }
        if(carry==1){
            int[] nouv=new int[digits.length+1];
            nouv[0]=1;
            for(int i=1;i<digits.length+1;i++){
                nouv[i]=retour[i-1];
            }
            return nouv;
        }
        return retour;
    }
}