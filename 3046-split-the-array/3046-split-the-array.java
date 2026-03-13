class Solution {
    public boolean count(int n, int[] nums){
        int i, count=0;
        for(i=0; i<nums.length; i++){
            if(nums[i] == n) count ++;
        }
        if (count > 2) return false;
        else return true;
    }

    public boolean isPossibleToSplit(int[] nums) {
        if ((nums.length)%2 == 0){
            int i;
            for (i=0; i<nums.length; i++){
                if(count(nums[i], nums) == false) return false;
            }
            return true;
        } else return false;
    }
}