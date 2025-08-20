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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast !=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow;
        ListNode prev = null;

        while(curr != null){
            ListNode newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;
        }
        slow = prev;

        ListNode p1 = head;
        ListNode p2 = slow;        

        while(p1 != null && p2 != null){
            if(p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}