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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || head.next==null || k==0) //If there are no nodes or only 1 node.
            return head;
        
        ListNode temp = head; //Calculate total number of nodes
        int count = 1;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        k = k%count; // Reducing the rotations since, the result is going to same.

        ListNode newHead = head;
        for(int i=0; i<k; i++)
            newHead = rotate(newHead);
        return newHead;
    }

    
    public static ListNode rotate(ListNode head){
        ListNode current = head;
        while(current.next.next != null)
            current = current.next;
        ListNode temp = current.next;
        temp.next = head;
        head = temp;
        current.next = null;
        return head;
    }
}
/*
Time complexity - O(n) , due to counting the nodes
Space complexity - O(1)
*/