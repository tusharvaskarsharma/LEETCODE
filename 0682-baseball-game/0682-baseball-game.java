import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> stk = new Stack<>();
        for(String i:operations){
            if (i.equals("C")){
                stk.pop();
            } else if (i.equals("D")){
                int top = stk.peek();
                stk.push(2*top);
            } else if (i.equals("+")){
                int a = stk.pop();
                int b = stk.peek();
                stk.push(a);
                stk.push(a+b);
            } else {
                stk.push(Integer.parseInt(i));
            }
        }
        while (!stk.empty()) {
            sum += stk.pop();
        }
        return sum;
    }
}