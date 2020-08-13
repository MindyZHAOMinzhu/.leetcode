#
# @lc app=leetcode id=1019 lang=python3
#
# [1019] Next Greater Node In Linked List
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def nextLargerNodes(self, head: ListNode) -> List[int]:
        tmp = head
        point = head.next
        ans = []
        while tmp != None:
            if point.val < tmp.val and point != None:
                while point.val < tmp.val:
                    point = point.next
                    ans.append[point.val]
            else:
                ans.append[point.val]
            tmp = tmp.next
        print(ans)


# @lc code=end

