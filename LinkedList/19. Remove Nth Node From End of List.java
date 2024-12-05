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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        //Approach 1
        /*
        int count = 1;
        ListNode current = head;
        while(current.next != null){
            current = current.next;
            count++;
        }

        if(head==null || count==1)
            return null;

        int delete_index = count-n;
        current = head;

        if(delete_index == 0){
            head = head.next;
            current.next = null;
            return head;
        }

        for(int i=0; i<delete_index-1; i++)
            current = current.next;
        ListNode temp = current.next;
        current.next = current.next.next;
        temp.next = null;
        temp = null;
        return head;
        */

        //Optimized approach
        ListNode fast = head;
        ListNode slow = head;
        for(int i=0; i<n; i++)
            fast = fast.next;

        if(fast == null){ // Edge case - If the first node to be deleted
            head = head.next;
            return head;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
/*
Approach 1 : Count the number of nodes, then subtract n to find the delete_index
    Time complexity - O(n) actually 2 times traversing
    Space complexity - O(1)

Approach 2 : Two pointers - Fast & Slow
    Time complexity - O(n) 1 time traversing
    Space complexity - O(1)

Note : 
    -> Edge case : If the node to be deleted is first or head node.
    -> Two pointers : 
        ~ First initialize both to head
        ~ Then move fast alone n steps forward
        ~ Then iterate until fast is pointing last node, so the slow node will be 'n' nodes behind fast.
*/
