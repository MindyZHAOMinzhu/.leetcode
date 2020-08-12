/*
 * @lc app=leetcode id=860 lang=java
 *
 * [860] Lemonade Change
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int sum = 0;
        for(int i = 0;i<bills.length;i++){
              sum += bills[i];

              if(sum <= bills[i] || sum % 10 != 5){
                  return false;
              }
        }

        return true;
    }
}
// @lc code=end

