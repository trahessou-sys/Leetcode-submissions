bool verif(const int* o, const int* t){
    for(int i=0;i<26;i++){
        if(o[i]!=t[i]){return false;}
    }
    return true;
}

bool checkInclusion(char* s1, char* s2) {
    size_t k = strlen(s1);
    size_t n = strlen(s2);

    if(n<k){return false;}

    int occu[26] = {0};
    int occu2[26] = {0};

    int i=0;
    int j=0;
    while(j<k){
        occu[s1[j]-'a']++;
        occu2[s2[j]-'a']++;
        j++;
    }
    j--;

    while(j<n-1){
        if(verif(occu,occu2)){
            return true;
        }
        i++;
        j++;

        occu2[s2[i-1]-'a']--;
        occu2[s2[j]-'a']++;
    }
    return verif(occu,occu2);
}