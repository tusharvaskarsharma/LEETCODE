class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minlen = Integer.MAX_VALUE;
        int lp = 0;
        int csum = 0;

        for(int r=0; r<n; r++){
            csum += nums[r];

            while(csum >= target){
                minlen = Math.min(minlen, r-lp+1);
                csum -= nums[lp];
                lp++;
            }
        }
        return (minlen == Integer.MAX_VALUE) ? 0 : minlen;
    }
}