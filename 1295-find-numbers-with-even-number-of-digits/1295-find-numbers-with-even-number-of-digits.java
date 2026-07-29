class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int i:nums){
            int tc = 0;
            while(i>0){
                i /= 10;
                tc++;
            }
            if (tc%2==0) c++;
        }
        return c;
    }
}