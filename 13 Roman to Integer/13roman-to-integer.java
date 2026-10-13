class Solution {
    public int romanToInt(String s) {
        int retour=0;
        int i=0;
        while(i<s.length()){
            if(i<s.length()-1 && verif(s.charAt(i),s.charAt(i+1))){
                retour+=valeur(s.charAt(i+1))-valeur(s.charAt(i));
                i++;
                i++;
            }else{
                retour+=valeur(s.charAt(i));
                i++;
            }
        }
        return retour;
    }

    public int valeur(char a){
        if(a=='I'){return 1;}
        if(a=='V'){return 5;}
        if(a=='X'){return 10;}
        if(a=='L'){return 50;}
        if(a=='C'){return 100;}
        if(a=='D'){return 500;}
        return 1000;
    }

    public boolean verif(char a, char b){
        if(a=='I' && (b=='V' || b=='X')){return true;}
        if(a=='X' && (b=='L' || b=='C')){return true;}
        if(a=='C' && (b=='D' || b=='M')){return true;}
        return false;
    }
}