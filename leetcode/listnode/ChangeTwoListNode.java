package listnode;

import listnode.model.ListNode;

public class ChangeTwoListNode {
    public static ListNode swapPairs(ListNode head) {
        ListNode virtual = new ListNode(-1, head);
        ListNode cur = virtual;
        while (cur.next != null && cur.next.next != null){
            ListNode tempCurNext1 = cur.next;
            ListNode tempCurNext3 = cur.next.next.next;
            ListNode tempCurNext2 = cur.next.next;
            cur.next = tempCurNext2;
            cur.next.next.next = tempCurNext1;
            cur.next.next = tempCurNext3;
            cur = tempCurNext3;
        }
        return virtual.next;
    }
}
