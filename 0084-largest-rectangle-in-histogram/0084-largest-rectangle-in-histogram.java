class Solution {
    public void rightsmall(int ht[], int r[]){
        Deque<Integer> s = new ArrayDeque<>();
        for (int i=ht.length-1; i>=0; i--) {
            while (!s.isEmpty() && ht[s.peek()] >= ht[i]) {
                s.pop();
            }

            r[i] = s.isEmpty() ? ht.length : s.peek();
            s.push(i);
        }
    }
    public void leftsmall(int ht[], int l[]){
        Deque<Integer> s = new ArrayDeque<>();
        for (int i=0; i<ht.length; i++) {
            while (!s.isEmpty() && ht[s.peek()] >= ht[i]) {
                s.pop();
            }

            l[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
    }


    public int largestRectangleArea(int[] h) {
        int ans = 0;
        int right[] = new int[h.length];
        int left[] = new int[h.length];
        rightsmall(h, right);
        leftsmall(h, left);

        for(int i=0; i<h.length; i++){
            int width = right[i] - left[i] - 1;
            int area = h[i]*width;
            ans = Math.max(ans, area);
        }
        return ans;
    }
}