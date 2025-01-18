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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        /*
        while(list1!=null && list2==null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }
        while(list2!=null && list1==null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }
        Instead of iterating just add a link.
        */
        temp.next = list1==null ? list2 : list1;
        return dummy.next;
    }
}
/*
Time complexity - O(n + m)
Space complexity - O(1)
*/