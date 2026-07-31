import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> arr = new ArrayList<>();
        int sr = 0;
        int er = mat.length-1;
        int sc = 0;
        int ec = mat[0].length-1;

        while(sr <= er && sc <= ec){
            for(int j=sc; j<=ec; j++) arr.add(mat[sr][j]);
            for(int i=sr+1; i<=er; i++) arr.add(mat[i][ec]);
            if (sr < er) 
                for(int j = ec - 1; j >= sc; j--) arr.add(mat[er][j]);
            if (sc < ec) 
                for(int i = er - 1; i > sr; i--) arr.add(mat[i][sc]);
            sr++;
            er--;
            sc++;
            ec--;
        }
        return arr;
    }
}