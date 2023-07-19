package listnode;

import listnode.model.ListNode;

import java.util.HashSet;
import java.util.Set;

public class InterSectionNode {
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        Set<ListNode> aSet = new HashSet<>();
        while (headA != null){
            aSet.add(headA);
            headA = headA.next;
        }

        while (headB != null){
            if (aSet.contains(headB)){
                return headB;
            }
            aSet.add(headB);
            headB = headB.next;
        }
        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode tempHeadA  = headA;
        ListNode tempHeadB  = headB;
        int lenA = 0;
        int lenB = 0;
        while (tempHeadA != null){
            lenA++;
            tempHeadA = tempHeadA.next;
        }
        while (tempHeadB != null){
            lenB++;
            tempHeadB = tempHeadB.next;
        }
        if (lenA < lenB){
            for (int i = 0; i < (lenB - lenA); i++) {
                headB = headB.next;
            }
        }else if (lenB < lenA){
            for (int i = 0; i < (lenA - lenB); i++) {
                headA = headA.next;
            }
        }
        while (headB != null && headA != null){
            if (headA == headB){
                return headB;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode tempHeadA = headA;
        ListNode tempHeadB = headB;
        while (true){
            if (tempHeadA == tempHeadB){
                return tempHeadA;
            }
            if (tempHeadA == null){
                tempHeadA = headB;
                continue;
            }
            if (tempHeadB == null){
                tempHeadB = headA;
                continue;
            }
            tempHeadA = tempHeadA.next;
            tempHeadB = tempHeadB.next;
            if (tempHeadA == null && tempHeadB == null){
                break;
            }
        }

        return null;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode tempHeadA = headA;
        ListNode tempHeadB = headB;
        while (tempHeadA != tempHeadB){
            tempHeadA = tempHeadA == null ? headB : tempHeadA.next;
            tempHeadB = tempHeadB == null ? headA : tempHeadB.next;
        }

        return tempHeadA;
    }
}
