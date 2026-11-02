class Solution {
    public int firstUniqChar(String s) {
        Queue<Character> q = new LinkedList<>();
        int arr[] = new int[26];
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            q.add(ch);
            arr[ch-97] += 1; 
        }
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(arr[ch-97] > 1) q.remove(); 
            else return i;
        }
        return -1;
    }
}