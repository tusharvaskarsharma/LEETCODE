class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int t = 0;
        int b = n-1;
        int l = 0;
        int r = n-1;
        int count = 1;
        while (t <= b && l <= r){
            for(int j=l; j<=r; j++) arr[t][j] = count++;
            t++;
            for(int i=t; i<=b; i++) arr[i][r] = count++;
            r--;
            for(int j=r; j>=l; j--) arr[b][j] = count++;
            b--;
            for(int i=b; i>=t; i--) arr[i][l] = count++;
            l++;
        }
        return arr;
    }
}