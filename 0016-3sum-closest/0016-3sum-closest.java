import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int lp = i + 1;
            int rp = nums.length - 1;

            while (lp < rp) {
                int sum = nums[i] + nums[lp] + nums[rp];

                if (Math.abs(sum - target) < Math.abs(closest - target)) closest = sum;
                if (sum == target) return target;
                else if (sum < target) lp++;
                else rp--;
            }
        }
        return closest;

    }
}
