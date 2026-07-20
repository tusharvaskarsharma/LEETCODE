import java.util.ArrayList;
class Solution {
    public int[] beautifulArray(int n) {
        if (n==1){
            int arrr[] = {1};
            return arrr;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        
        while (arr.size() < n){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int val:arr){
                if ((val*2)-1 <= n) temp.add((val*2)-1);
            }
            for(int val:arr){
                if ((val*2) <= n) temp.add(val*2);
            }
            arr = temp;
        } 

        int ans[] = new int[arr.size()];
        for (int i=0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}