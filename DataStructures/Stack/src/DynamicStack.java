public class DynamicStack {
    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data){
        if(size()==capacity){
            expandStack();            
        }
        stack[top] = data;
        top++;
        
    }

    private void expandStack() {
        int length = size();
        int[] newStack = new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack=newStack;
        capacity=capacity*2;
    }

    public int pop(){
        int data=0;
        if(top==0){
            System.out.println("Stack Empty");
            return data;
        }
        else{
            top--;
            data = stack[top];
            stack[top]=0;
            shrinkStack();
            return data;
        }
    }

    private void shrinkStack() {
        int length =  size();
        if(length<=(capacity/2)/2){
            capacity=capacity/2;
        }
        int[] newStack = new int[capacity];
        stack=newStack;
    }

    public int peek(){
        top--;
        int data = stack[top-1];
        return data;
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }

    public void show(){
        for(int n : stack){
            System.out.println(n +" ");
        }
    }
}
