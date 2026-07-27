class Solution {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public int[][] flipAndInvertImage(int[][] image) {
        for (int i[]:image){
            reverseArray(i);
        }
        for (int i[]:image){
            for(int j=0; j<i.length; j++){
                if(i[j] == 1) i[j] = 0;
                else i[j] = 1;
            }
        }
        return image;
    }
}