class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0) return m*n;
        int minr = 100000;
        int minc = 100000;
        int count = 0;
        for (int[] op : ops) {
            minr = Math.min(op[0], minr);
            minc = Math.min(op[1], minc);
        }
        return minr*minc;
    }
}