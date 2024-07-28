public class Stack {
    
    int stack[] = new int[5];
    int top = 0;

    public void push(int data){
        if(top==5){
            System.out.println("Stack Full");
        }
        else{
            stack[top] = data;
            top++;
        }
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
            return data;
        }
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
