#
# @lc app=leetcode id=203 lang=python3
#
# [203] Remove Linked List Elements
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: ListNode, val: int) -> ListNode:
        tmp = head
        if head == None:
            return None
        while tmp.next != None:
            if tmp.next.val != val:
                tmp = tmp.next
            else:
                tmp.next = tmp.next.next
        if head.val == val and head.next == None:
            return None
        elif head.val == val and head.next != None:
            return head.next
        return head
# @lc code=end

