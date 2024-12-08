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
        
        if(head==null || head.next==null)
            return false;
        if(head.next == head)
            return true;

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && slow!=null){
            if(slow == fast) // Both pointers meet if there is a cycle.
                return true;
            if(fast.next == null) // fast_pointer reached the tail node with no cycle.
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)
*/