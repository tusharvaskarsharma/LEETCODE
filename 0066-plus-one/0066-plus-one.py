class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        dig = ""
        for i in digits:
            dig += str(i)
        dig = int(dig)
        dig = dig+1
        arr = []
        for i in str(dig):
            arr.append(int(i))
        return arr