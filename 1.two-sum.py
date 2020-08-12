#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#

# @lc code=start
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # ans = []
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i] + nums[j] == target:
                    # print(i,j)
                    # ans.append(i)
                    # ans.append(j)
                    ans = [i,j]
                    return ans
        return [0,0]
        

# @lc code=end

