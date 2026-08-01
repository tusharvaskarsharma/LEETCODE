class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s = set(nums)
        ans = 0

        for x in s:
            if x - 1 not in s:      # Start of a sequence
                length = 1
                while x + 1 in s:
                    x += 1
                    length += 1
                ans = max(ans, length)

        return ans