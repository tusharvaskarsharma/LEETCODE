class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int revidx = 26 - (ch - 'a');
            sum = sum + ((i+1)*revidx);
        }
        return sum;
    }
}