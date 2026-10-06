/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return look(0,n);
    }

    int look(int low,int high){
        int mid=low + (high-low)/2;
        if(isBadVersion(mid)){
            if(mid==0){return 0;}
            if(!isBadVersion(mid-1)){return mid;}
            return look(low,mid);
        }else{
            return look(mid+1,high);
        }
        
    }
}