class MyQueue {
    static Stack<Integer> s1;
    static Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        if(s1.isEmpty()) s1.push(x);
        else{
            while(!s1.isEmpty()){
                int ele = s1.pop();
                s2.push(ele);
            }
            s1.push(x);
            while(!s2.isEmpty()){
                int ele = s2.pop();
                s1.push(ele);
            }
        }
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */