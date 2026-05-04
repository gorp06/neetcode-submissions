class MinStack {
Stack<Integer> stack;
Stack<Integer> minstack;
    public MinStack() {
       stack = new Stack<>();
        minstack = new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty() || val<=minstack.peek())
        minstack.push(val);
        
        
    }
    
    public void pop() {

       int val =0;
       if(!stack.isEmpty())
       val = stack.pop();
       if(!minstack.isEmpty()&&minstack.peek()==val)
       minstack.pop();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        if(!minstack.isEmpty())
       return  minstack.peek();
       else
       return 0;

        
    }
}
