import java.util.ArrayList;

/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> new_arr = new ArrayList<>();
        new_arr.add(nums[0]);
        for(int i = 1;i<nums.length;i++){
            if(new_arr.get(new_arr.size()-1) == nums[i]){
                break;
            }
            new_arr.add(nums[i]);
        }

        return new_arr.size();
    }
}
// @lc code=end

