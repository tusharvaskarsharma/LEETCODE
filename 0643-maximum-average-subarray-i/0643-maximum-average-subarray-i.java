class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        int sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];

        int maxSum = sum;

        int i = 0;
        int j = k;

        while (j < n) {
            sum += nums[j];
            sum -= nums[i];
            maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }
        return (double) maxSum / k;
    }
}