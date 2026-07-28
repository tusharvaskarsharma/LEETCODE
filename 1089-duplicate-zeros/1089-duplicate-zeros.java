class Solution {
    public void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];
        int tempIndex = 0;

        for (int i = 0; i < arr.length && tempIndex < arr.length; i++) {
            if (arr[i] == 0) {
                temp[tempIndex] = 0;
                if (tempIndex + 1 < arr.length) temp[tempIndex + 1] = 0;
                tempIndex += 2;
            } else {
                temp[tempIndex] = arr[i];
                tempIndex++;
            }
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }
}
