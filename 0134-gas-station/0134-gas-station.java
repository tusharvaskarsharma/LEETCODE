class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int tGas = 0, tCost = 0;

        int curGas=0;
        int start = 0;
        for(int i=0; i<n; i++){
            tGas += gas[i];
            tCost += cost[i];

            curGas += (gas[i]-cost[i]);
            if(curGas < 0){
                start = i+1;
                curGas = 0;
            }
        }

        
        if(tGas < tCost) return -1;
        return start;
    }
}