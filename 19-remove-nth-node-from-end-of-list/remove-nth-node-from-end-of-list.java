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
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        while(fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        //f prev == null (meaning fast reached null immediately after the for loop, so the //head itself is the target),
        if(prev == null) head = head.next;
        else prev.next = slow.next;

        return head;
    }
}