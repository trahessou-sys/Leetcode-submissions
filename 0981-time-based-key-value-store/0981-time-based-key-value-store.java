class TimeMap {

    HashMap<String,ArrayList<Pair>> stock;

    public TimeMap() {
        this.stock=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Pair temp = new Pair(timestamp,value);
        if(this.stock.containsKey(key)){
            ArrayList<Pair> actu = this.stock.get(key);
            actu.add(temp);
        }else{
            ArrayList<Pair> actu = new ArrayList<>();
            actu.add(temp);
            this.stock.put(key,actu);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!this.stock.containsKey(key)){
            return "";
        }
        ArrayList<Pair> actu = this.stock.get(key);
        return search(actu,timestamp);
    }

    private String search(ArrayList<Pair> actu, int t) {
        int low = 0;
        int high = actu.size() - 1;      
        String res = "";                 

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Pair par = actu.get(mid);

            if (par.timestamp <= t) {
                res = par.value;         
                low = mid + 1;           
            } else {
                high = mid - 1;          
            }
        }
        return res;
    }
}

public class Pair{
    public int timestamp;
    public String value;

    Pair(int t, String s){
        this.timestamp=t;
        this.value=s;
    }
} 

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */