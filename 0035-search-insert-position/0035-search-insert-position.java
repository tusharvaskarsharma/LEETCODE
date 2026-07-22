class Solution {
    public int searchInsert(int[] nums, int target) {
        int c = 0;
        while (c < nums.length){
            if (nums[c] < target) c++;
            else break;
        }
        return c;
    }
}