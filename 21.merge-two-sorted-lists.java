/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tmp1 = l1;
        ListNode tmp2 = l2;

        ListNode ans = new ListNode();
        
 
        if(l1.val <= l2.val){

            ans = l1;
            tmp1 = tmp1.next;
            
        }else{
            ans = l2;
            tmp2 = tmp2.next;
        }
        ListNode tmp = ans;

        while(l1.next != null && l2.next != null){

            if(l1.val <= l2.val){
                tmp.next = l1;
                tmp1 = tmp1.next;
                
            }else{
                tmp.next = l2;
                tmp2 = tmp2.next;
            }

            tmp = tmp.next;
        }

        if(l1.next == null){

            tmp.next = tmp2;
        }
    
        if(l2.next == null){
            tmp.next = tmp1;
        }
return ans.next;
    }
}
// @lc code=end

