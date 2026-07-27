class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int arr[] = new int[n];
        int lastseen = -n;
        for (int i=0; i<n; i++){
            if(s.charAt(i) == c) lastseen = i;
            arr[i] = (i - lastseen);
        }
        lastseen = 2*n;
        for (int i=n-1; i>=0; i--){
            if(s.charAt(i) == c) lastseen = i;
            arr[i] = Math.min(arr[i], lastseen - i);
        }

        return arr;
    }
}