/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

        //Approach 1
        /*
        ListNode current = node;
        while(current.next != null){
            current.val = current.next.val;
            current = current.next;  
        }
        ListNode temp = node;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        */

        //Approach 2
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

/*
Approach 1 :
    Time complexity - O(n)
    Space complexity - O(1)

Approach 2 :
    Time complexity - O(1)
    Space complexity - O(1)
*/