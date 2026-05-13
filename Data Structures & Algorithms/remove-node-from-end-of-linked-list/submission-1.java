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

        ListNode start =head;
        int i=0;
        int j=0;
        ListNode end= head;
        ListNode prev=null;
        while(end.next!=null ){
            end=end.next;
            j++;
        }
        System.out.println(end.val);
        while(j-i+1!=n){
            prev=start;
            start=start.next;
            i++;

        }

        if(prev==null)
        return start.next;
        else
        prev.next=start.next;

        return head;

    }
}
