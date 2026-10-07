class Solution {
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; 
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        int n2arr[] = new int[nums2.length];
        int ans[] = new int[nums1.length];

        for(int i=nums2.length-1; i>=0; i--){
            while(!s.isEmpty() && s.peek() <= nums2[i]) s.pop();
            if(s.isEmpty()) n2arr[i] = -1;
            else n2arr[i] = s.peek();
            s.push(nums2[i]);
        }

        for(int i=0; i<nums1.length; i++){
            int idx = linearSearch(nums2, nums1[i]);
            ans[i] = n2arr[idx];
        }


        return ans;
    }
}