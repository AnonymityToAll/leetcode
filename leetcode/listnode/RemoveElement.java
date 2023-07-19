package listnode;

import listnode.model.ListNode;

public class RemoveElement {
    public ListNode removeElements(ListNode head, int val) {
        ListNode virtualHead = new ListNode(val, head);
        ListNode pre = virtualHead;
        ListNode cur = head;
        while (cur != null){
            if (cur.val == val){
                pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return virtualHead.next;
    }
}
