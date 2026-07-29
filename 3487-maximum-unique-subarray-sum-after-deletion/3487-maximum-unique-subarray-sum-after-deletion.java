import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int num : nums) max = Math.max(max, num);

        
        if (max <= 0) return max;
        
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for (int num : nums) if (num > 0 && set.add(num)) ans += num;
        return ans;
    }
}