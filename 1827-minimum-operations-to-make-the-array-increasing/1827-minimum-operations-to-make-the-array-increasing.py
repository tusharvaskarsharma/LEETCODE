class Solution:
    def minOperations(self, nums: list[int]) -> int:
        operations = 0
        
        for i in range(1, len(nums)):
            if nums[i] <= nums[i - 1]:
                expected = nums[i - 1] + 1
                operations += expected - nums[i]
                nums[i] = expected
                
        return operations
