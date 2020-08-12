/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newNode = new ListNode();

        if(head == null){
            return null;
        }
        ListNode tmp = head;
        ListNode tmpNext = head.next;

        while(tmp.next != null){
            tmp.next = newNode.next;
            newNode.next = tmp;

            tmp = tmpNext;
            tmpNext = tmp.next;
        }
        tmp.next = newNode.next;
        newNode.next = tmp;
        return newNode.next;
        
    }
}
// @lc code=end

