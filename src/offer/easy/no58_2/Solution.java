package offer.easy.no58_2;

/**
 * @Author: wisedu1
 */
class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s.charAt(i));
        }

        return stringBuilder.toString();
    }
}

