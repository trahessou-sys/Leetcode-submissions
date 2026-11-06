int indx(char c){
    if('a'<=c && c<='z'){
        return c-'a';
    }
    return c-'A'+26;
}

bool valid(const int* o, const int *t){
    for(int i=0;i<52;i++){
        if(o[i]>t[i]){
            return false;
        }
    }
    return true;
}

char* minWindow(char* s, char* t) {
    size_t m =strlen(s);
    size_t n=strlen(t);

    if(m<n){return calloc(1, sizeof(char));}

    int i=0;
    int j=0;

    int ed=-1;
    int st=-1;

    int occu[52] = {0};
    int occu2[52] = {0};

    for(int k=0;k<n;k++){
        occu[indx(t[k])]++;
    }

    while(j<m){
        occu2[indx(s[j])]++;

        while(!valid(occu,occu2) && j<m-1){
            j++;
            occu2[indx(s[j])]++;
        }
        
        while(valid(occu,occu2) && i<=j){
            occu2[indx(s[i])]--;
            i++;
        }

        if(i>0){
            occu2[indx(s[i-1])]++;
            if(valid(occu,occu2)&& (st==-1 ||ed-st>j-(i-1)+1)){
                st=i-1;
                ed=j+1;
            }
            occu2[indx(s[i-1])]--;
        }
        j++;
    }

    if(st==-1){return calloc(1, sizeof(char));}

    char *r=calloc(ed-st+1,sizeof(char));
    for(int p=0;p<ed-st;p++){
        r[p]=s[st+p];
    }
    r[ed-st]='\0';
    return r;
}