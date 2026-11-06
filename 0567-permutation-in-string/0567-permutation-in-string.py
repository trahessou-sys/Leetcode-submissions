class Solution(object):
    def checkInclusion(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        if(len(s2)<len(s1)):
            return False
        occu=[0 for i in range(26)]
        occu2=[0 for i in range(26)]
        i=0
        j=0

        while(j<len(s1)):
            occu[ord(s1[j])-ord('a')]+=1
            occu2[ord(s2[j])-ord('a')]+=1
            j+=1
        
        j-=1

        while(j<len(s2)-1):
            if(self.verif(occu,occu2)):
                return True
            
            i+=1
            j+=1

            occu2[ord(s2[i-1])-ord('a')]-=1
            occu2[ord(s2[j])-ord('a')]+=1
        
        return self.verif(occu,occu2)
    
    def verif(self,o,t):
        for i in range(26):
            if(o[i]!=t[i]):
                return False
        return True
        

        