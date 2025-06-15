/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode Ahead = headA;
        ListNode Bhead = headB;

        while(Ahead != Bhead){
            Ahead = Ahead == null? headB:Ahead.next;
            Bhead = Bhead == null? headA:Bhead.next;
        }
        return Ahead;
    }
}