import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        else {
            Arrays.sort(nums);
            int count = 1;
            int prev = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] != prev) {
                    count++;
                    prev = nums[i];
                }
                if (count == 3) return nums[i];
            }
            return nums[nums.length - 1];
        }
        
    }
}