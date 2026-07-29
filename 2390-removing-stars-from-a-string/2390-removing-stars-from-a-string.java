import java.util.*;
class Solution {
    public String removeStars(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '*') stk.pop();
            else stk.push(ch);
        }
        StringBuilder result = new StringBuilder();
        while (!stk.isEmpty()) {
            result.append(stk.pop());
        }
        return result.reverse().toString();
    }
}