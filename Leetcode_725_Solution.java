/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode arr[] = new ListNode[k];
        ListNode current = head;
        int size = 0;
        while(current != null){
            size++;
            current = current.next;
        }
        int splitin = size/k;
        int extra = size % k;

        current = head;
        ListNode prev = current;
        for(int i =0 ;i<k ;i++){
            ListNode addi = current;
            int currsize = splitin;
            if(extra > 0){
                extra--;
                currsize++;
            }
            int j =0;
            while(j < currsize){
                prev = current ;
                current = current.next;
                j++;
            }
            if(prev != null){
                prev.next = null;
            }
            arr[i] = addi;
        }
        return arr;
    }
}
