class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int tsum = 0;
        int gmax = Integer.MIN_VALUE;
        int gmin = Integer.MAX_VALUE;
        int cmax = 0;
        int cmin = 0;
        int n = nums.length;
        // Code here
        for (int i=0; i<n; i++){
            tsum += nums[i];
            cmax += nums[i];
            cmin += nums[i];
            if (cmax > gmax) gmax = cmax;
            if (cmax < 0) cmax = 0;
            if (cmin < gmin) gmin = cmin;
            if (cmin > 0) cmin = 0;
        }
        if (gmax < 0) return gmax;
        else return Math.max(gmax,(tsum-gmin));
    }
}