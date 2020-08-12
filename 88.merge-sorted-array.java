/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;

        int tmp = m + n -1;

        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                nums1[tmp] = nums1[i];
                i--;
            }else{
                nums1[tmp] = nums2[j];
                j--;
            }
            tmp --;
        }

        while(i >= 0){
            nums1[tmp] = nums1[i];
            i--;
            tmp--;
        }

        while(j >= 0){
            nums1[tmp] = nums2[j];
            j--;
            tmp--;
        }
    }
}
// @lc code=end

