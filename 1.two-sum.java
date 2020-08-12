import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

// HashTable: search and add is O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0;i< nums.length;i++){
            if (map.containsKey(target - nums[i])) {
            result[1] = i;
            result[0] = map.get(target - nums[i]);
            return result;
        }

        map.put(nums[i], i);
    }
    return result;
    }
    
}
// @lc code=end

