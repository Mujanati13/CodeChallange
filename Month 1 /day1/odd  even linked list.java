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
    public ListNode oddEvenList(ListNode head) {
                
            if(head == null) return null;
            
            ListNode add = head;
            ListNode even = head.next;
            
            ListNode evenlist = even;
            
            while(even != null && even.next != null) {
                    add.next = add.next.next;
                    even.next = even.next.next;
                    add = add.next;
                    even = even.next;
            }
            
            add.next = evenlist;
            
            return head;
            
            
    }
}
