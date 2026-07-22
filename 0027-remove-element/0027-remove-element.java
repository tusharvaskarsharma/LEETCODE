class Solution {
    public int removeElement(int[] nums, int val) {
        int lp=0, rp=nums.length-1;
        int count=0;
        while(lp <= rp){
            if(nums[lp] == val){
                int temp = nums[lp];
                nums[lp] = nums[rp];
                nums[rp] = temp;
                rp--;
            }
            else lp++;
        }
        return rp+1;
    }
}