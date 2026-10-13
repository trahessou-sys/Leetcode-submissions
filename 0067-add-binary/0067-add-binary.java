class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        char[] x = (a.length()>=b.length())? a.toCharArray() : remplir(a,b.length());
        char[] y = (b.length()>=a.length())? b.toCharArray() : remplir(b,a.length());

        LinkedList<Character> liste = new LinkedList<>();
        int retenue=0;
        for(int i=Math.max(a.length(),b.length())-1;i>=0;i--){
            if(retenue==0){
                if(x[i]=='1' && y[i]=='1'){
                    liste.addFirst('0');
                    retenue=1;
                }else if(x[i]=='0' && y[i]=='0'){
                    liste.addFirst('0');
                }else{
                    liste.addFirst('1');
                }
            }else{
                if(x[i]=='0' && y[i]=='0'){
                    liste.addFirst('1');
                    retenue=0;
                }else if(x[i]=='1' && y[i]=='1'){
                    liste.addFirst('1');
                }else{
                    liste.addFirst('0');
                }
            }
        }
        if(retenue==1){liste.addFirst('1');}
        
        for (char c : liste) sb.append(c);
        return sb.toString();
    }

    public char[] remplir(String a, int k){
        char[] retour = new char[k];
        for(int i=0;i<k;i++){
            if(i<k-a.length()){retour[i]='0';}
            else{retour[i]=a.charAt(i-(k-a.length()));}
        }
        return retour;
    }
}