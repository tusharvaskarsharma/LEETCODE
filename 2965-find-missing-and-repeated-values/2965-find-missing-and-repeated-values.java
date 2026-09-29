class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] freq = new int[size + 1];

        int repeated = -1;
        int missing = -1;
        
        // Populate frequencies directly
        for (int[] row : grid) {
            for (int val : row) {
                freq[val]++;
            }
        }    
        // Finding  the anomalies
        for (int i = 1; i <= size; i++) {
            if (freq[i] == 2) repeated = i;
            else if (freq[i] == 0) missing = i;
    
            if (repeated != -1 && missing != -1) break;
        }
        return new int[]{repeated, missing};
    }
}
