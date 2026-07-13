class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() > 1){
            if (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())) return true;
            else if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) return true;
            else return false;
        }else return true;
    }
}