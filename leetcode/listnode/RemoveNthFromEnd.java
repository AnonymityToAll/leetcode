package listnode;

import listnode.model.ListNode;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode virtualHead = new ListNode(-1, head);
        ListNode fastNode = head;
        ListNode resNode = head;
        ListNode pre = virtualHead;
        while (fastNode != null && n > 0){
            n--;
            fastNode = fastNode.next;
        }
        if (n > 0){
            return null;
        }
        if (fastNode == null){
            pre.next = head.next;
        }
        while (fastNode != null){
            fastNode = fastNode.next;
            pre = resNode;
            resNode = resNode.next;
            if (fastNode == null){
                pre.next = resNode.next;
            }
        }
        return virtualHead.next;
    }

    public ListNode removeNthFromEndOpt(ListNode head, int n) {
        ListNode virtualHead = new ListNode(-1, head);
        ListNode fastNode = head;
        ListNode slowNode = virtualHead;
        for (int i = 0; i < n; i++) {
            fastNode = fastNode.next;
        }
        while (fastNode != null){
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        slowNode.next = slowNode.next.next;
        return virtualHead.next;
    }
}
