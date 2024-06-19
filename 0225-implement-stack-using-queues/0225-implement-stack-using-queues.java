class MyStack {
    Queue<Integer> first;
    Queue<Integer> second;

    public MyStack() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }
    
    public void push(int x) {
        first.add(x);
    }
    
    public int pop() {
        while(first.size()>1){
            second.add(first.remove());
        }
        int popped = first.remove();
        Queue<Integer> temp = first;
        first = second;
        second = temp;
        return popped;
    }
    
    public int top() {
        while(first.size()>1){
            second.add(first.remove());
        }
        int top = first.remove();
        second.add(top);
        Queue<Integer> temp = first;
        first = second;
        second = temp;
        return top;
    }
    
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */