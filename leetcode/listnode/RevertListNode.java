package listnode;

import listnode.model.ListNode;

public class RevertListNode {
    public ListNode reverseList(ListNode head) {
        ListNode virtualHead = new ListNode(-1, head);
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode tempCurNext = cur.next;
            ListNode tempCur = cur;
            cur.next = pre;
            pre = tempCur;
            cur = tempCurNext;
        }
        return pre;
    }
}
