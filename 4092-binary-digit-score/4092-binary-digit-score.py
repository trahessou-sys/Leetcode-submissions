class Solution(object):
    def calculateScore(self, a, b):
        """
        :type a: int
        :type b: int
        :rtype: int
        """
        s1=0
        s2=0
        k=a
        while(k>0):
            s1=s1+k%2
            k=int(k/2)

        k=b
        while(k>0):
            s2=s2+k%2
            k=int(k/2)
        if(s1>=s2):
            return s1*s2
        return s2/s1