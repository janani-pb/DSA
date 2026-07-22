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
        ListNode temp = new ListNode(0,head);
        int l=0;
        ListNode curr=head;
        while(curr!=null){
            l++;
            curr=curr.next;
        }
        curr=temp;
        for(int i=0;i<l-n;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return temp.next;
    }
}