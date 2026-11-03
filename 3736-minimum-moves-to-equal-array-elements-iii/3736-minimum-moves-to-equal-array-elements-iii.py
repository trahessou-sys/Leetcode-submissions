class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxi=nums[0]
        r=0
        for i in nums :
            if(i>maxi):
                maxi=i
            r+=i
        return len(nums)*maxi-r
        