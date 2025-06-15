/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Leetcode_142_Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode i = head;
        ListNode j = head;
        boolean circularll = false;

        while(j != null && j.next != null){
            i = i.next;
            j = j.next.next;
            if( i == j) {
                circularll = true;
                break;
            }
        }
        if( circularll == false) return null;
        while( i != head){
            i = i.next;
            head = head.next;
        }
        return i;
    }
}