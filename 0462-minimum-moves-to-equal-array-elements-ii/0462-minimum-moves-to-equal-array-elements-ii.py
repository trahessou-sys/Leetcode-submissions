class Solution(object):
    def minMoves2(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        mid=len(nums)//2
        moves=0
        temp=0
        for i in range(len(nums)):
            moves+=abs(nums[i]-nums[mid])
            temp+=abs(nums[i]-nums[mid-1])
        return min(moves,temp)
