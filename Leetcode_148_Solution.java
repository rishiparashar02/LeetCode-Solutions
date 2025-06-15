class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();

        if (head == null) return null;
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        Collections.sort(list);

        ListNode sortedHead = new ListNode(list.get(0));
        ListNode currentNode = sortedHead;
        for (int i = 1; i < list.size(); i++) {
            currentNode.next = new ListNode(list.get(i));
            currentNode = currentNode.next;
        }

        return sortedHead;
    }
}
