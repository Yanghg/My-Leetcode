//sort
//usage of treeset
public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums == null || k <= 0 || t < 0)
            return false;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            if(i - k - 1 >= 0)
                set.remove(nums[i - k - 1]);
            int n = nums[i];
            if(set.floor(n) != null && n <= t + set.floor(n) || 
                    set.ceiling(n) != null && set.ceiling(n) <= t + n)
                return true;
            set.add(n);
        }
        return false;
    }
}