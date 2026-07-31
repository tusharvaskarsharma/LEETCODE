class Solution {
    public int maxProfit(int[] p) {
        int hold1 = -p[0];
        int hold2 = -p[0];
        int sold1 = 0;
        int sold2 = 0;
        for(int i:p){
            hold1 = Math.max(hold1, -i);
            sold1 = Math.max(sold1, hold1+i);
            hold2 = Math.max(hold2, sold1-i);
            sold2 = Math.max(sold2, hold2+i);
        }
        return sold2;
    }
}