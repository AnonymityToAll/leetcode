package prac;

import hash.HappyNum;
import listnode.CycleNode;
import listnode.RemoveElement;
import listnode.RevertListNode;
import listnode.model.ListNode;
import stackandqueue.EvalRPN;
import stackandqueue.MaxSlidingWindows;
import stackandqueue.MyStack;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(6);
//        ListNode node4 = new ListNode(3);
//        ListNode node5 = new ListNode(4);
//        ListNode node6 = new ListNode(5);
//        ListNode node7 = new ListNode(6);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;
//        node7.next = node3;
//        CycleNode cycleNode = new CycleNode();
//        cycleNode.detectCycle(node1);
//        HappyNum happyNum = new HappyNum();
//        happyNum.isHappy(19);
//        int aa = 1;

        Queue<Integer> integers = new PriorityQueue<>((u,v)->(v-u));
        integers.offer(1);
        integers.offer(3);
        integers.offer(2);
        while (!integers.isEmpty()){
            System.out.println("=="+integers.poll());
        }

    }

    public static Integer getFei(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 1;
        }
        return getFei(n-1)+getFei(n-2);
    }

    public static Integer getFei1(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a;
    }

}
