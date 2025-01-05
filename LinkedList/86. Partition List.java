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
    public ListNode partition(ListNode head, int x) {
        
        if(head == null)
            return null;

        ListNode lessHead = new ListNode(-1);
        ListNode greatHead = new ListNode(-1);
        ListNode less = lessHead;
        ListNode great = greatHead;
        ListNode temp = head;

        while(temp != null){
            if(temp.val < x){
                less.next = temp;
                less = less.next;
            }
            else{
                great.next = temp;
                great = great.next;
            }
            temp = temp.next;
        }
        great.next = null;
        less.next = greatHead.next;

        return lessHead.next;
    }
}

/*
Time complexity - O(n)
Space complexity - O(1)
*/