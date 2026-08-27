class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if (nums.length%2==0){
            int mid = nums.length/2;
            return nums[mid];
        }else {
            int mid = nums.length/2;
            return nums[mid];
        }
    }
}