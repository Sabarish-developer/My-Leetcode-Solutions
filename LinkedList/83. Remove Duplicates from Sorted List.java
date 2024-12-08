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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null) // Return if there are no nodes or only 1 node.
            return head;
        
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null){
            if(fast.val == slow.val){
                fast = fast.next;
            }
            else{
                slow.next = fast;
                slow = fast;
                fast = fast.next;
            }
        }
        slow.next = null; //Making slow pointer as tail node
        return head;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)
*/