class Trie {
   Node arbre;

    public Trie() {
        this.arbre=new Node('\0',false);
    }
    
    public void insert(String word) {
        int k=word.length();
        if(k==0){return;}
        Node temp=arbre;
        for(int i=0;i<k;i++){
            temp=temp.insert(word.charAt(i),i==k-1);
        }

    }

    
    public boolean search(String word) {
        int k=word.length();
        Node temp=arbre;
        int i=0;
        while(i<k){
            char t=word.charAt(i);
            if(temp.children[t-'a']==null){return false;}
            temp=temp.children[t-'a'];
            i++;
        }
        return temp.endofword;
    }
    
    public boolean startsWith(String word) {
        int k=word.length();
        Node temp=arbre;
        int i=0;
        while(i<k){
            char t=word.charAt(i);
            if(temp.children[t-'a']==null){return false;}
            temp=temp.children[t-'a'];
            i++;
        }
        return true;
    }
}

class Node {
    char cha;
    boolean endofword;
    Node[] children;

    Node(char c,boolean b){
        this.cha=c;
        this.endofword=b;
        this.children=new Node[26];
    }

    Node insert(char c,boolean b){
        if(this.children[c-'a']==null){
            this.children[c-'a']=new Node(c,b);
        }
        if(b){this.children[c-'a'].endofword=b;}
        return this.children[c-'a'];
    }

    

    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */