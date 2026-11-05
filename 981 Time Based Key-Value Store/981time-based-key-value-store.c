#define NB_BUCKETS 10007   /* taille de la table de hachage */


typedef struct {
    int timestamp;
    char* value;
} Pair;

typedef struct Entry {
    char* key;
    Pair* pairs;          /* tableau */
    int size;             /* nombre d'éléments */
    int cap;              /* capacité allouée */
    struct Entry* next;   /* chaînage  */
} Entry;

typedef struct {
    Entry* buckets[NB_BUCKETS];
} TimeMap;

static char* copyString(const char* s) {
    size_t n = strlen(s) + 1;          
    char* c = malloc(n);
    memcpy(c, s, n);
    return c;
}

TimeMap* timeMapCreate(void) {
    return calloc(1, sizeof(TimeMap));   
}



static unsigned long hash(const char* s) {
    unsigned long h = 5381;
    int c;
    while ((c = (unsigned char)*s++)) {
        h = h * 33 + c;
    }
    return h % NB_BUCKETS;
}

static Entry* findEntry(TimeMap* obj, const char* key) {
    Entry* e = obj->buckets[hash(key)];
    while (e != NULL) {
        if (strcmp(e->key, key) == 0) {
            return e;
        }
        e = e->next;
    }
    return NULL;
}


void timeMapSet(TimeMap* obj, char* key, char* value, int timestamp) {
    Entry* e = findEntry(obj, key);

    if (e == NULL) {                     
        e = malloc(sizeof(Entry));
        e->key = copyString(key);
        e->size = 0;
        e->cap = 4;
        e->pairs = malloc(e->cap * sizeof(Pair));

        unsigned long h = hash(key);      
        e->next = obj->buckets[h];
        obj->buckets[h] = e;
    }

    if (e->size == e->cap) {              
        e->cap *= 2;
        e->pairs = realloc(e->pairs, e->cap * sizeof(Pair));
    }

    e->pairs[e->size].timestamp = timestamp;   
    e->pairs[e->size].value = copyString(value);
    e->size++;
}

static char* search(Entry* e, int t) {
    int low = 0;
    int high = e->size - 1;
    char* res = "";

    while (low <= high) {
        int mid = low + (high - low) / 2;   
        Pair par = e->pairs[mid];

        if (par.timestamp <= t) {
            res = par.value;
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return res;
}

char* timeMapGet(TimeMap* obj, char* key, int timestamp) {
    Entry* e = findEntry(obj, key);
    if (e == NULL) {
        return "";
    }
    return search(e, timestamp);
}

void timeMapFree(TimeMap* obj) {
    for (int i = 0; i < NB_BUCKETS; i++) {
        Entry* e = obj->buckets[i];
        while (e != NULL) {
            Entry* suivant = e->next;
            for (int j = 0; j < e->size; j++) {
                free(e->pairs[j].value);
            }
            free(e->pairs);
            free(e->key);
            free(e);
            e = suivant;
        }
    }
    free(obj);
}

/**
 * Your TimeMap struct will be instantiated and called as such:
 * TimeMap* obj = timeMapCreate();
 * timeMapSet(obj, key, value, timestamp);
 
 * char* param_2 = timeMapGet(obj, key, timestamp);
 
 * timeMapFree(obj);
*/