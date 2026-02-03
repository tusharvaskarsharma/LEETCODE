class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if (nums.length %2 != 0){
            return nums[(int)(nums.length/2)];
        } else {
            return nums[(int)(nums.length/2)];
        }
    }
}