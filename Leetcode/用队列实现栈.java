import java.util.LinkedList;
import java.util.Queue;
public class MyStack {
    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }
    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
    }
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        for(int i = 0;i < queue.size()-1;i++) {
            int pro = queue.poll();
            queue.offer(pro);
        }
        return queue.poll();
    }
    /** Get the top element. */
    public int top() {
        int pro = 0;
        for(int i = 0;i < queue.size();i++) {
            pro = queue.poll();
            queue.offer(pro);
        }
        return pro;
    }
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}