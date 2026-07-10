class Solution {
    List<String> arr = new ArrayList<>(); // VARIABLE ARR

    void binaryStr(int n, int lastp, String str){

        if (n==0){
            arr.add(str);
            return;
        }
        
        binaryStr(n-1, 1, str+'1');
        if (lastp == 1) binaryStr(n-1, 0, str+'0');

    }
    public List<String> validStrings(int n) {
        
        binaryStr(n, 1, "");
        return arr;
    }
}