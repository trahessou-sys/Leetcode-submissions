class Solution(object):
    def minRotations(self, s):
        """
        :type s: str
        :rtype: int
        """
        retour=0
        for i in range(len(s)):
            a=int(s[i])
            b=int(s[i-1]) if i>0 else 0
            
            c=min(max(a,b)-min(a,b),min(a,b)+(9-max(a,b))+1)
            retour=retour+c
        return retour
        
        