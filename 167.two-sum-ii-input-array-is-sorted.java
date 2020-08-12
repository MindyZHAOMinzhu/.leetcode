/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input array is sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int tmp1 = 0;
        int tmp2 = numbers.length -1;

        while(numbers[tmp1] + numbers[tmp2] != target && tmp1 != tmp2){
            
            int sum = numbers[tmp1] + numbers[tmp2];
            if(sum > target){
                tmp2 --;
            }else{
                tmp1 ++;
            }


        }
int[] ans = {tmp1+1, tmp2+1};
        return ans;
        
    }
}
// @lc code=end

