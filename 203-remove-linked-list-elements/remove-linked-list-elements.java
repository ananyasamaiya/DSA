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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode prev = null;
        ListNode temp = head;
        

        while(temp != null){
            boolean flag = false;
            if(temp.val == val){
                flag = true;
                if(prev == null) 
                {
                    head = temp.next; 
                }
                else {
                    prev.next = temp.next;
                }
            }
            if(!flag)  prev = temp;
            temp = temp.next;
        }
    return head;
    }
}