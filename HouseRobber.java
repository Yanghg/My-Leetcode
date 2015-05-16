//dynamic programming 不是一定要用recursion，关键的是自下而上的构建过程
public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length ==0) return 0;

        int len = nums.length;
        if(len == 1) return nums[0];
        if(len == 2) return Math.max(nums[0],nums[1]);
        if(len == 3) return Math.max(nums[0]+nums[2], nums[1]);

        nums[2] = nums[0]+nums[2];//f(2) = a[0] + a[2]

        for(int i=3; i<len; i++){
            nums[i] = Math.max(nums[i-3], nums[i-2])+nums[i];
        }

        return Math.max(nums[len-1], nums[len-2]);
    }
}