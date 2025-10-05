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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode middle = getMiddle(head);
        ListNode middleNext = middle.next;
        middle.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(middleNext);

        ListNode result = MergeSort(left,right);

        return result;
    }
    public ListNode MergeSort(ListNode left,ListNode right){
        if(left == null) return right;
        if(right == null) return left;
        ListNode result = new ListNode();
        if(left.val <= right.val){
            result = left;
            result.next = MergeSort(left.next,right);
        }
        else {
            result = right;
            result.next = MergeSort(left,right.next);
        }
        return result;
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