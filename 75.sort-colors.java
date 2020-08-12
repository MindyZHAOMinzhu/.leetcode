import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> frequencyForNum = new HashMap<>();
        for(int val: nums){

            frequencyForNum.put(val, frequencyForNum.getOrDefault(val, 0) + 1);
        }

        int tmp = 0;
        if(frequencyForNum.get(0) != null){
        for(int i = frequencyForNum.get(0);i>0;i--){
            nums[tmp] = 0;
            tmp ++;
        }
    }
    if(frequencyForNum.get(1) != null){
        for(int i = frequencyForNum.get(1);i>0;i--){
            nums[tmp] = 1;
            tmp ++;
        }
    }

    if(frequencyForNum.get(2) != null){
        for(int i = frequencyForNum.get(2);i>0;i--){
            nums[tmp] = 2;
            tmp ++;
    }
}
        
        
    }
}
// @lc code=end

