package offer.easy.no62;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wisedu1
 */
class Solution {
    public int lastRemaining(int n, int m) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            index = (index + m - 1) % arrayList.size();
            arrayList.remove(index);
        }
        return arrayList.get(0);
    }
}
