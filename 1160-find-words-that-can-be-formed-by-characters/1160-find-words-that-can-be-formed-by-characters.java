class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charsFreq = new int[26];
        for (char c : chars.toCharArray())
            charsFreq[c - 'a']++;
        int ans = 0;
        for (String word : words) {
            int[] wordFreq = new int[26];
            for (char c : word.toCharArray()) wordFreq[c - 'a']++;

            boolean valid = true;
            for (int i = 0; i < 26; i++) {
                if (wordFreq[i] > charsFreq[i]) {
                    valid = false;
                    break;
                }
            }
            if (valid) ans += word.length();
        }
        return ans;
    }
}