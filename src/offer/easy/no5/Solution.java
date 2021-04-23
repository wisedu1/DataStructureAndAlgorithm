package offer.easy.no5;

/**
 * @author wisedu1
 */
public class Solution {
    public String replaceSpace(String s) {
        int spaceNum = 0;
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                newString.append("%20");
            } else {
                newString.append(s.charAt(i));
            }
        }
        return newString.toString();
    }
}
