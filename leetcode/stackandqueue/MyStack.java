package stackandqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    /**
     * 队列相关操作
     * offer
     * peek
     * poll
     */

    private Queue<Integer> myStack;

    /**
     * constructor
     */
    public MyStack() {
        myStack = new LinkedList<>();
    }

    /**
     * push to top
     * @param x
     */
    public void push(int x) {
        myStack.offer(x);
    }

    /**
     * remove top
     * @return
     */
    public int pop() {
        int res = -1;
        int i = 0;
        Queue<Integer> changeQue = new LinkedList<>();
        while (!myStack.isEmpty()){
            res = myStack.poll();
            changeQue.offer(res);
            i++;
        }
        for (int j = 0; j < i - 1; j++) {
            myStack.offer(changeQue.poll());
        }
        return res;
    }

    /**
     * return top
     * @return
     */
    public int top() {
        int res = -1;
        for (Integer integer : myStack) {
            res = integer;
        }
        return res;
    }

    public boolean empty() {
        return myStack.isEmpty();
    }
}
