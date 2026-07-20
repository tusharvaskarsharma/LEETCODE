class Solution {
    public boolean isMonotonic(int[] nums) {
        // int i, p=0, n=0, e=0;
        // for (i=0; i<nums.length-1; i++){
        //     if ((nums[i+1]-nums[i])> 0) p++;
        //     else if ((nums[i+1]-nums[i])< 0) n++;
        //     else e++;
        // }

        // if ((p!=0 && n==0) || (n!=0 && p==0) || (p==0 && n==0 && e==(nums.length-1))) return true;
        // else return false;

        boolean inc = true, dec = true;
        for(int i=0; i<nums.length-1; i++){
            if (nums[i] > nums[i+1]) inc = false;
            if (nums[i] < nums[i+1]) dec = false;
        }
        return inc || dec;
    }

}