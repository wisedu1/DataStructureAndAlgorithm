package offer.easy.no57_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wisedu1
 */
class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
        int left = 1, right = 2;
        int mid = (target + 1) / 2;
        while (right <= mid && left < right) {
            int sum = 0;
            for (int i = left; i <= right; i++) {
                sum += i;
            }
            if (sum == target) {
                int [] tempResult = new int[right - left + 1];
                for (int i = 0; i < tempResult.length; i++) {
                    tempResult[i] = left + i;
                }
                list.add(tempResult);
                left++;
            }
            if (sum > target) {
                left++;
            }
            else {
                right++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
