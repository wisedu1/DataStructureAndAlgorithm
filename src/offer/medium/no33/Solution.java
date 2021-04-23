package offer.medium.no33;

class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return dfs(postorder, 0, postorder.length - 1);
    }

    private boolean dfs(int[] arr, int left, int right) {
        if (left >= right) {
            return true;
        }
        int p = left;
        while (arr[p] < arr[right]) {
            p++;
        }
        int m = p;
        while (arr[p] > arr[right]) {
            p++;
        }
        return (p == right) && dfs(arr, left, m - 1) && dfs(arr, m, right - 1);
    }
}