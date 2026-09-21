class Solution {
    public boolean isAnagram(String s, String t) {
        String s1 = s.toLowerCase(), s2 = t.toLowerCase();
        if (s1.length() != s2.length()) return false;
        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();

        Arrays.sort(s1Char);
        Arrays.sort(s2Char);

        return Arrays.equals(s1Char, s2Char);
    }
}