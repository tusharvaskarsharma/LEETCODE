class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        array = []
        for i in nums1:
            array.append(i)
        for i in nums2:
            array.append(i)
        array.sort()
        if len(array)%2 == 0:
            median1 = int ((len(array)/2))
            return float((array[median1]+array[median1-1])/2)
        else:
            
            median = int ((len(array)/2) - 0.5)
            return float(array[median])