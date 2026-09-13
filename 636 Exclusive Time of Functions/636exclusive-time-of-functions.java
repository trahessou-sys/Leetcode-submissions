class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] retour=new int[n];
        int compteur=0;
        int temps=0;
        List<String> Stack = new ArrayList<>();
        while(compteur<logs.size()){
            String actu = logs.get(compteur);
            if(!isEnd(actu)){
                if(!Stack.isEmpty()){
                    String ancien= Stack.get(Stack.size()-1);
                    int indic=indice(ancien);
                    retour[indic]+=fin(actu)-temps;
                }
                Stack.add(actu);
                temps=fin(actu);
            }else{
                int indic=indice(actu);
                Stack.remove(Stack.size()-1);
                retour[indic]+=fin(actu)-temps+1;
                temps=fin(actu)+1;
            }
            
            compteur++;
        }
        return retour;
    }

    public boolean isEnd(String log){
        int i=0;
        while(log.charAt(i)!=':'){i++;}
        return log.charAt(i+1)=='e';
    }

    public int indice(String log){
        int i=0;
        while(log.charAt(i)!=':'){i++;}
        return Integer.parseInt(log.substring(0,i));
    }

    public int fin(String log){
        int i=0;
        while(log.charAt(i)!=':'){i++;}
        if(log.charAt(i+1)=='e'){i=i+4;}
        else{i=i+6;}
        return Integer.parseInt(log.substring(i+1));
    }
}