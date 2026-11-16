class Solution {
    public String digitSum(String s, int k) {
        String re=s;
        while(re.length()>k){
            re=sum(re,k);
        }
        return re;
    }

    public String sum(String s, int k){
        StringBuilder r=new StringBuilder();
        for (int i = 0; k * i < s.length(); i++){
            int sum=0;
            for(int j=0;j<Math.min(k,s.length()-k*i);j++){
                sum+=s.charAt(k*i+j)-'0';
            }
            r.append(Integer.toString(sum));
        }
        return r.toString();
    }
}