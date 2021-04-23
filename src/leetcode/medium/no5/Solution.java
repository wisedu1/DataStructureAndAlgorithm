package leetcode.medium.no5;

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty() || s.length() == 1) {
            return s;
        }

        int length = s.length();
        int maxStart = 0, maxEnd = 0, maxSubstringLength = 1;

        boolean[][] dp = new boolean[length][length];
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    if (i - j + 1 > maxSubstringLength) {
                        maxSubstringLength = i - j + 1;
                        maxStart = j;
                        maxEnd = i;
                    }
                }
            }
        }
        return s.substring(maxStart, maxEnd + 1);
    }
}