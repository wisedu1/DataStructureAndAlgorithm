package offer.easy.no58_2;

/**
 * @Author: wisedu1
 */
class Solution {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < chars.length - 1; j++) {
                char temp = chars[j];
                chars[j] = chars[j + 1];
                chars[j + 1] = temp;
            }
        }
        return String.valueOf(chars);
    }
}
