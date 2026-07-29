class Solution {
    public int[] minCosts(int[] cost) {
        int n = cost.length;
        int[] ans = new int[n];

        int minCost = cost[0];
        for (int i = 0; i < n; i++) {
            minCost = Math.min(minCost, cost[i]);
            ans[i] = minCost;
        }
        return ans;
    }
}
