class Solution(object):
    def minEatingSpeed(self, piles, h):
        """
        :type piles: List[int]
        :type h: int
        :rtype: int
        """
        low= (sum(piles)+h-1)//h
        high=max(piles)

        while(low<high):
            mid=low+(high-low)//2
            if(not self.valid(piles,mid,h)):
                low=mid+1
            else :
                high=mid
        
        return low

    def valid(self,piles,k,h):
        if(k<=0):
            return False
        heures=0
        for i in range(len(piles)):
            heures+=(piles[i]+k-1)//k
            if(heures>h):
                return False
        return True
        