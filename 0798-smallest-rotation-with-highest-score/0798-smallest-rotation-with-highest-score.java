class Solution {
    public int bestRotation(int[] nums) {
        int n = nums.length;
        int[] change = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int left = (i - num + 1 + n) % n;
            int right = (i + 1) % n;

            change[left]--;
            change[right]++;

            if (left > right) {
                change[0]++;
            }
        }

        int best = 0;
        int score = 0;
        int maxScore = -1;

        for (int i = 0; i < n; i++) {
            score += change[i];
            if (score > maxScore) {
                maxScore = score;
                best = i;
            }
        }

        return best;
    }
}