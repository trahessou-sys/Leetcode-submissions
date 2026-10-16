typedef struct {
    int places[3];   /* places restantes : big, medium, small */
} ParkingSystem;

ParkingSystem* parkingSystemCreate(int big, int medium, int small) {
    ParkingSystem *obj = malloc(sizeof(ParkingSystem));
    if (obj == NULL)
        return NULL;
    obj->places[0] = big;
    obj->places[1] = medium;
    obj->places[2] = small;
    return obj;
}

bool parkingSystemAddCar(ParkingSystem* obj, int carType) {
    return obj->places[carType - 1]-- > 0;
}

void parkingSystemFree(ParkingSystem* obj) {
    free(obj);
}

/**
 * Your ParkingSystem struct will be instantiated and called as such:
 * ParkingSystem* obj = parkingSystemCreate(big, medium, small);
 * bool param_1 = parkingSystemAddCar(obj, carType);
 
 * parkingSystemFree(obj);
*/