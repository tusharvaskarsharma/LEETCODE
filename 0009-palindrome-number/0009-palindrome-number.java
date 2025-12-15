class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        } else if (x < 10){
            return true;
        } else{
            int rev = 0;
            int n = x;
            while (x>0){
                rev = rev*10 + x%10;
                x /= 10;
            }
            if(rev == n){
                return true;
            } else{
                return false;
            }
        }
    }
}