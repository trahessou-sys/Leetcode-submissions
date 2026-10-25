class Solution {
    public int calculateScore(int a, int b) {
        int s1=0;
        int s2=0;

        int k=a;
        while(k>0){
            s1+=k%2;
            k=k/2;
        }

        k=b;
        while(k>0){
            s2+=k%2;
            k=k/2;
        }
        return (s1>=s2)? s1*s2 : s2/s1;
        
    }
}