class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int count = 0;
        for (int i:nums){
            if(i==1) count++;
            else count = 0;
            maxOne = Math.max(maxOne, count);
        }
        return maxOne;
    }
}