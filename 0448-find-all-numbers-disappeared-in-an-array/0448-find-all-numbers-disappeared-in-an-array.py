class Solution:
    def findDisappearedNumbers(self, nums: list[int]) -> list[int]:
        arr = []
        num_set = set(nums) 
        for i in range(1, len(nums) + 1):
            if i not in num_set: 
                arr.append(i)
        return arr
