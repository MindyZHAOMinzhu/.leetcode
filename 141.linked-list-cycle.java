/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode s1 = head;
        ListNode s2 = head.next;

        while(s1 != null && s2 != null && s2.next != null){
            if(s1.val == s2.val){
                return true;
            }else{
                s1 = s1.next;
                s2 = s2.next.next;
            }
        }
        return false;
        
    }
}
// @lc code=end

