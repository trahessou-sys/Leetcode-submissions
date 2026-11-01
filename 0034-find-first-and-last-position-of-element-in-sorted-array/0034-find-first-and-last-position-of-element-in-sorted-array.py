class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        retour=[0,0]
        n =len(nums)
        if(n==0 or target<nums[0] or target>nums[n-1]):
            retour[0]=-1
            retour[1]=-1
        else:
            retour[0]=self.search(nums,target,0,n)
            retour[1]=self.searchc(nums,target,0,n)
        return retour
    
    def search(self,nums,target,low,high):
        if(low>=high):
            return -1
        mid=low+(high-low)//2
        if(nums[mid]==target and (mid==0 or nums[mid-1]<nums[mid])):
            return mid
        if(nums[mid]<target):
            return self.search(nums,target,mid+1,high)
        return self.search(nums,target,low,mid)
    
    def searchc(self,nums,target,low,high):
        if(low>=high):
            return -1
        mid=low+(high-low)//2
        if(nums[mid]==target and (mid==len(nums)-1 or nums[mid+1]>nums[mid])):
            return mid
        if(nums[mid]<=target):
            return self.searchc(nums,target,mid+1,high)
        return self.searchc(nums,target,low,mid)
        
        