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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        Set<Integer> set = new HashSet<> ();
        for(Integer i: nums)
            set.add(i);
        
        while(head!=null && set.contains(head.val))
            head = head.next;
        
        ListNode current = head;
        while(current.next != null){
            if(set.contains(current.next.val))
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;
    }
}
/*
Time complexity - O(m + n)
Space complexity - O(m)
*/