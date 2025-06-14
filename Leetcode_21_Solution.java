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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new LinkedList<>();
        ListNode h = new ListNode(-1);
        ListNode helper = h;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                helper.next = list2;
                list2 = list2.next;
            } else {
                helper.next = list1;
                list1 = list1.next;
            }
            helper = helper.next;
        }
        if (list1 != null) {
            helper.next = list1;
        } else if (list2 != null) {
            helper.next = list2;
        }
        return h.next;
    }
}