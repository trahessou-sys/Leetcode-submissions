class Solution(object):
    def maximizeSum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        n=len(nums)
        retour=0
        reaarange=[0 for i in range(n)]
        for i in range(n):
            retour=retour+nums[i]
            reaarange[i]=self.rearange(nums[i])-nums[i]
        reaarange.sort()
        for i in range(k):
            retour=retour+reaarange[n-1-i]
        return retour
    

    def rearange(self,o):
        compte = [0 for i in range(10)]
        if (o == 0) :
            compte[0] = 1
        while (o > 0):
            compte[o % 10]+=1   
            o //= 10            
        
        resultat = 0
        for c in range(9,-1,-1):
            for k in range(compte[c]) :
                resultat = resultat * 10 + c;
        return resultat;