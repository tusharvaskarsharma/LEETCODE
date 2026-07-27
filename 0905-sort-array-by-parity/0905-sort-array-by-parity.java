class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        if(n==1) return nums;
        int lp = 0, rp = n-1;
        while(lp< rp){
            while (rp>lp && (nums[rp]%2 != 0)) rp--;
            while (lp<rp && (nums[lp]%2 == 0)) lp++;
            int temp = nums[lp];
            nums[lp] = nums[rp];
            nums[rp] = temp;
                       
        } 
        return nums;
    }
}