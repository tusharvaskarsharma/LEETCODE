class Solution {
    public int[][] transpose(int[][] matrix) {
        if (matrix.length==1 && matrix[0].length==1) return matrix;
        int m = matrix.length;
        int n = matrix[0].length;
        if (m==n){
            for(int i=0; i<m; i++){
                for(int j=0; j<i; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            return matrix;
        } else {
            int arr[][] = new int[n][m];
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    arr[j][i] = matrix[i][j];
                }
            }
            return arr;
        }
        
    }
}