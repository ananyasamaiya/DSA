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
    public void reorderList(ListNode head) {
        ListNode middle = getMiddle(head);
        ListNode reversedHalf = reverse(middle.next);
        middle.next = null; 
        ListNode temp = head;
        Merge(head,reversedHalf);
        
    }
    public void Merge(ListNode first, ListNode second){
        while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2; 
        }
    }
    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode head1 = null;
        while(temp != null){
            ListNode i = new ListNode(temp.val);
            i.next = head1;
            head1 = i;
            temp = temp.next;
        }
        return head1;
    }
    public ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}