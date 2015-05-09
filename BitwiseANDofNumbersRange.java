// only higher bit of m and n will be reserved after AND
public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int mask = Integer.MAX_VALUE;
        while((m & mask) != (n & mask))
            mask <<= 1;
        return m & mask;
    }
}