class MinStack {

    Node top;
    public MinStack(){
        this.top = null;
    }
    
    public void push(int val) {
        Node temp = new Node(val);
        if(top == null){
            top = temp;
            top.min = val;
        }
        else{
            temp.min = val<top.min ? val : top.min;
            temp.next = top;
            top = temp;
        }
    }
    
    public void pop() {
        if(top == null)
            return;
        else{
            top = top.next;
        }
    }
    
    public int top() {
        if(top == null)
            throw new IllegalStateException();
        return top.data;
    }
    
    public int getMin() {
        if(top == null)
            throw new IllegalStateException();
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
class Node{
    int data;
    int min;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

/*
Time complexity - O(1)
Space complexity - O(1)

Logic : 
    -> Every node have data,min,next.
    -> min is used to store the minimum value till the current node.
*/