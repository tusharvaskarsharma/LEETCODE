class Solution:
    def bestRotation(self, nums):
        n = len(nums)
        change = [0] * (n + 1)

        for i, num in enumerate(nums):
            left = (i - num + 1 + n) % n
            right = (i + 1) % n

            change[left] -= 1
            change[right] += 1

            if left > right:
                change[0] += 1

        best = 0
        score = 0
        maxScore = -1

        for i in range(n):
            score += change[i]
            if score > maxScore:
                maxScore = score
                best = i

        return best