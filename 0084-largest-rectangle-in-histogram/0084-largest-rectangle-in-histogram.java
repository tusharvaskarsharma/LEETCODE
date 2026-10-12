class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        int nsl[] = new int[n];
        int nsr[] = new int[n];

        //next smaller height at left
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<n; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if (s.isEmpty()) nsl[i] = -1;
            else nsl[i] = s.peek();
            s.push(i);
        }

        //next smaller height on right
        s = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if (s.isEmpty()) nsr[i] = n;
            else nsr[i] = s.peek();
            s.push(i);
        }

        //curArea
        for(int i=0; i<n; i++){
            int h = heights[i];
            int w = nsr[i] - nsl[i] - 1;
            int area = h*w;
            if (area > maxArea) maxArea = area; 
        }

        return maxArea;
    }
}