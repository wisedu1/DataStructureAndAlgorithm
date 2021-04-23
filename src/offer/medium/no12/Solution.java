package offer.medium.no12;

public class Solution {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // 从 (i,j) 这个坐标开始查找
                if (dfs(board, words, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] words, int i, int j, int index) {
        // index 表示是查到字符串 words 的第几个字符
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != words[index])
            return false;
        if (index == words.length - 1)
            return true;
        char tmp = board[i][j];
        board[i][j] = '.';
        boolean res = dfs(board, words, i + 1, j, index + 1) || dfs(board, words, i - 1, j, index + 1) ||
                dfs(board, words, i, j + 1, index + 1) || dfs(board, words, i, j - 1, index + 1);
        board[i][j] = tmp;
        return res;
    }
}
