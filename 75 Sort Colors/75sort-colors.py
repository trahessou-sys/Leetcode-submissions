class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        r=0
        b=0
        w=0
        for i in nums:
            if(i==0): 
                r+=1
            elif(i==1):
                w=w+1
            elif(i==2):
                b+=1
        
        for i in range(len(nums)):
            if(i<r):
                nums[i]=0
            elif(i<r+w):
                nums[i]=1
            else:
                nums[i]=2
        
            