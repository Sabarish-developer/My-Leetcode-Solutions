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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;
        int sum = 0;
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(l1!=null && l2!=null){
            sum = l1.val + l2.val + carry;
            if(sum > 9){
                carry = sum / 10;
                sum = sum % 10;
            }
            else
                carry = 0;
            ListNode temp = new ListNode(sum);
            current.next = temp;
            current = temp;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode remaining = l1==null ? l2 : l1;
        while(remaining != null){
            sum = remaining.val + carry;
            if(sum > 9){
                carry = sum / 10;
                sum = sum % 10;
            }
            else
                carry = 0;
            ListNode temp = new ListNode(sum);
            current.next = temp;
            current = temp;
            remaining = remaining.next;
        }
        if(carry > 0){
            ListNode temp = new ListNode(carry);
            current.next = temp;
        }
        return dummy.next;
    }
}
/*
Time complexity - O(n) 
Space complexity - O(n)
    n -> maximum number of nodes in both lists.
*/