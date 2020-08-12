/*
 * @lc app=leetcode id=633 lang=java
 *
 * [633] Sum of Square Numbers
 */

// @lc code=start
class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt(c);
        while(i<=j){
            if(i*i + j*j > c){
                j--;
            }else if(i*i + j*j < c){
                i++;
            }else{
                return true;
            }
        }

        return  false;

    }
}
// @lc code=end

