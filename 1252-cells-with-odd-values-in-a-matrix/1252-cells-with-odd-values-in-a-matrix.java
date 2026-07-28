class Solution {
    public int oddCells(int m, int n, int[][] indi) {
        int arr[][] = new int[m][n];
        for (int k[]:indi){
            for(int i=0; i<m; i++) arr[i][k[1]]++;
            for(int j=0; j<n; j++) arr[k[0]][j]++;
        }
        int count = 0;

        for(int i[]:arr) for(int j:i) if(j%2!=0) count++;
        return count;
    }
}