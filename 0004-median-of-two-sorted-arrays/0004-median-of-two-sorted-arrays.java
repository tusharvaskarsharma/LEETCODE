import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] arr = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            arr[i] = nums1[i];
        }

        for (int i = 0; i < n2; i++) {
            arr[i + n1] = nums2[i];
        }

        Arrays.sort(arr);

        int total = n1 + n2;
        if (total % 2 == 0) {
            int mid = total / 2;
            return (arr[mid - 1] + arr[mid]) / 2.0;
        }
        else {
            return arr[total / 2];
        }
    }
}
