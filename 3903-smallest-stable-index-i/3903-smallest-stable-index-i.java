class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int i, n = nums.length;
        int maxn = Integer.MIN_VALUE; 
        int minn = Integer.MAX_VALUE; 
        int max[] = new int[n];
        int min[] = new int[n];


        for (i=n-1; i>=0; i--){
            if (nums[i]<=minn){
                minn = nums[i];
            }
            min[i] = minn;
        }
        for (i=0; i<n; i++){
            if (nums[i]>=maxn){
                maxn = nums[i];
            }
            max[i] = maxn;

            if (max[i] - min[i] <= k) { 
                return i; // Pehla stable index milte hi yahan se return ho jao
            }
        }

        return -1; // Agar poore loop mein koi stable index nahi mila

    }
}