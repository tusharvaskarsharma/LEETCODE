class Solution {
    public boolean isPerfectSquare(int num) {
        int nSqrt = (int)Math.sqrt(num);
        int nSq = (int)Math.pow(nSqrt,2);
        if (nSq == num) return true;
        else return false;
    }
}