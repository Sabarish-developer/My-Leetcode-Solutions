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
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        int count = 0;
        while(fast != null){
            while(fast!=null && slow.val==fast.val){
                count++;
                fast = fast.next;
            }
            if(count == 1){
                prev.next = slow;
                prev = slow;
            }
            count = 0;
            slow = fast;
        }
        prev.next = null; // Make it as tail node
        return dummy.next;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)

Logic :
    -> Use dummy node before head so that process will be easy if head itself have duplicate.
    -> Intialize prev_pointer = dummy.
    -> slow_pointer is starting point of a number.
    -> fast_pointer is ending point of a number.
    -> count is number of times a numbe repeated between slow_pointer and fast_pointer.
    -> If count is 1 , then append it by prev.next = slow, prev = slow.
    -> Set count = 0, start with moving slow and fast.

*/