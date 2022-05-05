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
    public ListNode reverseList(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        ListNode dumm = temp.next;
        while (dumm != null) {
            
            temp.next = prev;
            prev = temp;
            temp = dumm;
            dumm = dumm.next;
        }
        temp.next = prev;
        head = temp;
        return head;
    }
}
