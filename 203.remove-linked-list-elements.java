/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {

        ListNode tmp = head;

        while(tmp != null){
            if(tmp.val == val){
                System.out.print(tmp.next.val);
                tmp.next = tmp.next.next;
                System.out.print(tmp.next.val);
            }

            tmp = tmp.next;          
        }

        return head;
        
    }
}
// @lc code=end

