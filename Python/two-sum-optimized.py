class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        values = {}
        for i, num in enumerate(nums):
            key = target - num
            if key in values.keys():
                return [values[key],i]
            else:
                values[num] = i
        
        return []