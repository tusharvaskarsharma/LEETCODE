import java.util.Arrays;
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] < 0 && k >0){
                nums[i] = nums[i]*(-1);
                k--;
            }
        }

        int minAbs = Integer.MAX_VALUE;

        for (int i:nums){
            sum += i;
            minAbs = Math.min(minAbs, Math.abs(i));
        }
        if (k%2 != 0)  sum = sum - (2 * minAbs);
        return sum;
    }
}