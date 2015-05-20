//subarray in this question is continuous
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int firstPos = 0, sum = 0, minLength = nums.length + 1;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= s){
                minLength = Math.min(minLength, i - firstPos + 1);
                sum -= nums[firstPos];
                firstPos++;
            }
        }
        return minLength == nums.length + 1? 0: minLength;
    }
}