class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        if(len(s)<=1):
            return s
        maxStr=s[0:1]
        for i in range(0,len(s)-1):
            odd = self.expandFromCenter(s, i, i)
            even = self.expandFromCenter(s, i, i + 1)

            if (len(odd) > len(maxStr)):
                maxStr = odd
            if (len(even) > len(maxStr)):
                maxStr = even

        return maxStr

    def expandFromCenter(self,s,left,right):
        while (left >= 0 and right < len(s) and s[left] == s[right]):
            left=left-1
            right=right+1
        return s[left+1:right]
    
        