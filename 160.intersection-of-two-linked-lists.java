/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode l1 = headA;
        ListNode l2 = headB;
        while (l1 != l2) {
            if(l1 == null){
                l1 = headB;
            }else{
                l1 = l1.next;
            }
            // l1 = (l1 == null) ? headB : l1.next;
            // l2 = (l2 == null) ? headA : l2.next;
            if(l2 == null){
                l2 = headA;
            }else{
                l2 = l2.next;
            }
        }
        return l1;
        
        
        
    }
}
// @lc code=end

