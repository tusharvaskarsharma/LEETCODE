class Solution {
    public int compress(char[] chars) {
        int ansCount = 0;
        for(int i=0; i<chars.length; i++){
            Integer count = 1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            chars[ansCount] = chars[i];
            ansCount++;
            if(count>1){
                String str = count.toString();
                for(int j=0; j<str.length(); j++){
                    chars[ansCount] = str.charAt(j);
                    ansCount++;
                }
            }
        }
        return ansCount;
    }
}