package listnode;

import listnode.model.ListNode;

public class CycleNode {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null  && slow != null){
            if (fast.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                fast = head;
                break;
            }
        }

        while (fast != null && slow != null){
            if (fast == slow){
                return fast;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }
}
