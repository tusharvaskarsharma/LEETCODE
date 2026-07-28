import java.util.Arrays;
class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int sarr[] =  Arrays.copyOf(heights, heights.length);
        Arrays.sort(sarr);
        for (int i=0; i<heights.length; i++){
            if(heights[i] != sarr[i]) count++;
        }
        return count;
    }
}