import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxl = 0;
        List<Character> arr = new ArrayList<>();

        while(end < s.length()){
            if(!arr.contains(s.charAt(end))){
                arr.add(s.charAt(end));
                end++;
                maxl = Math.max(maxl, arr.size());
            } else{
                arr.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return maxl;
    }
}