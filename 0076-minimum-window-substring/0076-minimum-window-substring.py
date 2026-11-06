class Solution(object):
    def valid(self,o,t):
        for i in range(52):
            if(o[i]>t[i]):
                return False
        return True

    def idx(self,c):
        if(ord('a')<=ord(c) and ord(c)<=ord('z')):
            return ord(c)-ord('a')
        return 26+ord(c)-ord('A')
    
    def minWindow(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """

        m=len(s)
        n=len(t)
        if(m<n):
            return ""
        
        i=0
        j=0

        st=-1
        ed=-1

        occu=[0 for k in range(52)]
        occu2=[0 for k in range(52)]

        for k in range(n):
            occu[self.idx(t[k])]+=1
        
        while(j<m):
            occu2[self.idx(s[j])]+=1

            while((not self.valid(occu,occu2)) and j<m-1):
                j+=1
                occu2[self.idx(s[j])]+=1
            
            while(self.valid(occu,occu2) and i<=j):
                occu2[self.idx(s[i])]-=1
                i+=1
            
            if(i>0):
                occu2[self.idx(s[i-1])]+=1
                if(self.valid(occu,occu2) and (st==-1 or ed-st>j-(i-1)+1)):
                    st=i-1
                    ed=j+1
                occu2[self.idx(s[i-1])]-=1
            j+=1
        
        if(st==-1):
            return ""
        
        return s[st:ed]
        