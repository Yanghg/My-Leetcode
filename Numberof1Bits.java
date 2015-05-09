//logic right shift ">>"" fill new high bits with original significant bit 
//arithmatic right shift ">>>" fill new high bits with 0 

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int weight = 0;
        for (int i = 0, j = 1; i < 32; i ++){
            if ((j & n) != 0)
                weight += 1;
            j <<= 1;
        }
        return weight;
    }
}