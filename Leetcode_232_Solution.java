class MyQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int a) {
        while(q1.isEmpty()){
            q1.offer(q2.poll());
        }
        q1.offer(a); //add
        while(q2.isEmpty()){
            q2.offer(q1.poll()); //remove
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int peek() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */