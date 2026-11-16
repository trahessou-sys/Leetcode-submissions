class KthLargest(object):
    s=[]
    k=-1

    def __init__(self, k, nums):
        """
        :type k: int
        :type nums: List[int]
        """
        self.s=[]
        self.k=k
        for i in range(len(nums)):
            if(i<k):
                heapq.heappush(self.s, nums[i])
            elif(nums[i]>self.s[0]):
                heapq.heappop(self.s)
                heapq.heappush(self.s,nums[i])
        

    def add(self, val):
        """
        :type val: int
        :rtype: int
        """
        if(len(self.s)<self.k):
            heapq.heappush(self.s, val)
        elif(val>self.s[0]):
            heapq.heappop(self.s)
            heapq.heappush(self.s,val)
        return self.s[0]
        


# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)