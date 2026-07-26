class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i[]:accounts){
            int curMax = 0;
            for(int j:i){
                curMax += j;
            }
            max = Math.max(max, curMax);
        }
        return max;
    }
}