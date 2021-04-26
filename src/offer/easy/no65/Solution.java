package offer.easy.no65;

/**
 * @Author: wisedu1
 */
class Solution {
    public int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        int c = (a & b) << 1;
        int d = a ^ b;
        return add(d, c);
    }
}
