class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 1) return 1;
        int max = 0;
        int curMax = 1;
        for(int i=1; i<nums.length; i++){
            if (nums[i]> nums[i-1]) curMax++;
            else curMax=1;
            max = Math.max(curMax, max);
        }
        return max;
    }
}