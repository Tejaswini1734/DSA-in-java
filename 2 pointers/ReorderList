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
        if(head == null || head.next == null){
            return;
        }
        ListNode slow=head,fast=head;
        while(fast!= null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev =null,next=null;
        while(slow!=null){
            next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        ListNode firsthalf=head;
        ListNode secondhalf=prev;
        
        while(secondhalf.next!= null){
            next=firsthalf.next;
            prev=secondhalf.next;
            firsthalf.next=secondhalf;
            secondhalf.next=next;
            firsthalf=next;
            secondhalf=prev;
        }
    }
}
