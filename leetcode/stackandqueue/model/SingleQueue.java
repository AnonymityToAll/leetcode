package stackandqueue.model;

import java.util.Deque;
import java.util.LinkedList;

public class SingleQueue {
    private Deque<Integer> myQueue = new LinkedList<>();
    public SingleQueue() {
    }

    public void push(int num){
        while (!myQueue.isEmpty() && num > myQueue.peek()) {
            myQueue.removeLast();
        }
        myQueue.add(num);
    }

    public void pop(int val){
        if (!myQueue.isEmpty() && val == myQueue.peek()){
            myQueue.removeLast();
        }
    }

    public int peek(){
        return myQueue.peek();
    }
}
