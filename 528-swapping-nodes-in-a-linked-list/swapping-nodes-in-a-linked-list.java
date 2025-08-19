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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode kth = head;
        for(int i=0; i<k; i++){
            kth = fast;
            fast = fast.next;
        }
        while(fast !=null){
            slow = slow.next;
            fast = fast.next;
        }
        int temp = kth.val;
        kth.val = slow.val;
        slow.val = temp;

        return head;
    }
}