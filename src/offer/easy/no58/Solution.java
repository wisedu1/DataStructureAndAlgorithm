package offer.easy.no58;

/**
 * @Author: wisedu1
 */
public class Solution {
    public String reverseWords(String s) {
        if (s.isEmpty()) {
            return s;
        }

        int indexBegin = 0;
        while (indexBegin != s.length() && s.charAt(indexBegin) == ' ') {
            indexBegin++;
        }
        if (indexBegin == s.length()) {
            return "";
        }
        int indexEnd = s.length() - 1;
        while (s.charAt(indexEnd) == ' ') {
            indexEnd--;
        }
        s = s.substring(indexBegin, indexEnd + 1);

        String[] strings = s.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (!strings[strings.length - 1 - i].isEmpty()) {
                stringBuilder.append(strings[strings.length - 1 - i]);
                if (i != strings.length - 1) {
                    stringBuilder.append(' ');
                }
            }
        }
        return stringBuilder.toString();
    }
}
