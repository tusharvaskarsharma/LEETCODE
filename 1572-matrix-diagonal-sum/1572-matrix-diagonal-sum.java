class Solution {
    public int diagonalSum(int[][] mat) {
        int pd = 0, sd = 0;
        int n = mat.length;
        for(int i=0; i<n; i++){
            pd += mat[i][i];
            if(i != n-i-1){
                sd += mat[i][n-i-1];
            }
        }
        return pd+sd;
    }
}