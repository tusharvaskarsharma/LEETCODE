class Solution {
    public int dominantIndex(int[] nums) {
        int maxi1 = Integer.MIN_VALUE;
        int maxIdx = Integer.MIN_VALUE;
        int maxi2 = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>maxi1) {
                maxi1 = nums[i];
                maxIdx = i;
            }
        }        
        for(int i:nums) if (i>maxi2 && i!=maxi1) maxi2 = i;

        if (2*maxi2 <= maxi1) return maxIdx;
        else return -1;
    }
}