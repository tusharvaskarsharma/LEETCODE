import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int lp = i+1;
            int rp = nums.length-1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while(lp< rp){
                if (nums[i]+nums[lp]+nums[rp] == 0){
                    int temp[] = new int[3];
                    arr.add(Arrays.asList(nums[i], nums[lp], nums[rp]));
                    lp++;
                    rp--;
                    while (lp < rp && nums[lp] == nums[lp - 1]) lp++;
                    while (lp < rp && nums[rp] == nums[rp + 1]) rp--;
                } else if (nums[i]+nums[lp]+nums[rp] > 0) rp--;
                else lp++; 
            }
        }
        return arr;

    }
}