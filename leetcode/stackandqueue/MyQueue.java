package stackandqueue;

import java.util.Stack;

class MyQueue {

    Stack<Integer> myQueue;

    /**
     * 构造方法
     */
    public MyQueue() {
        myQueue = new Stack<>();
    }

    /**
     * 放到队尾
     * @param x
     */
    public void push(int x) {
        myQueue.push(x);
    }

    /**
     * 将队首的元素移除 并返回
     * @return
     */
    public int pop() {
        Integer remove = myQueue.remove(0);
        return remove;
    }

    /**
     * 返回队首元素
     * @return
     */
    public int peek() {
       return myQueue.get(0);
    }

    /**
     * 判断是不是空的
     * @return
     */
    public boolean empty() {
        return myQueue.isEmpty();
    }
}
