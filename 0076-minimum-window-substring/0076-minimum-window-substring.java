class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        if (t.length() > n) return "";

        int rqlen = t.length();
        int[] mp = new int[128];

        for (char ch : t.toCharArray()) {
            mp[ch]++;
        }
        int i = 0, j = 0;
        int minwinsize = Integer.MAX_VALUE;
        int si = 0;

        while (j < n) {
            char ch = s.charAt(j);

            if (mp[ch] > 0) rqlen--;
            mp[ch]--;

            while (rqlen == 0) {
                int curwinsize = j - i + 1;

                if (curwinsize < minwinsize) {
                    minwinsize = curwinsize;
                    si = i;
                }
                mp[s.charAt(i)]++;

                if (mp[s.charAt(i)] > 0) rqlen++;
                i++;
            }
            j++;
        }
        return minwinsize == Integer.MAX_VALUE ? "" : s.substring(si, si + minwinsize);
    }
}