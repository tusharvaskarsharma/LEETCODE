class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length==1 && nums[0]==1) return 1;
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