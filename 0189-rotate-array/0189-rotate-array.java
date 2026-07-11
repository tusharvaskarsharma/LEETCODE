class Solution {
    public void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
        return;
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %=n;
        if (n == 1) return;
        reverse(nums, 0, n-1 );
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        return;
    }
}