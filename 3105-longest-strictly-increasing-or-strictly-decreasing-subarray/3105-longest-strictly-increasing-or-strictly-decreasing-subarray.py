class Solution(object):
    def longestMonotonicSubarray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxin=1
        maxde=1
        i=0
        j=0
        while(j<len(nums)-1):
            if(nums[j+1]>nums[j]):
                j+=1
                if(j-i+1>maxin):
                    maxin=j-i+1
            else:
                i=j+1
                j+=1
        
        i=0
        j=0
        while(j<len(nums)-1):
            if(nums[j+1]<nums[j]):
                j+=1
                if(j-i+1>maxde):
                    maxde=j-i+1
            else:
                i=j+1
                j+=1
        
        return max(maxde,maxin)
            
        
            
        
        