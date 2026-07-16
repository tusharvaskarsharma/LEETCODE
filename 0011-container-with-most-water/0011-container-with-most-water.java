class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int rp = height.length-1;
        int lp = 0;
        while(lp<rp){
            int curwat = (rp - lp)*(Math.min(height[lp], height[rp]));
            max = Math.max(max, curwat);
            if (height[lp] < height[rp]) lp++;
            else rp--;
        }
        return max;
    }
}