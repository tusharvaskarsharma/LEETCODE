class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 0; // Pointer for the last unique element found
        
        for (int j = 1; j < nums.length; j++) {
            // If we find a new unique element
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // Move it to the next unique position
            }
        }
        
        return i + 1; // Number of unique elements
    }
}