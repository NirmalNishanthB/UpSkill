public class Queue {
    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
        if(!isFull()){
            queue[rear] = data;
            rear++;
            size++;
        }
        else{
            System.out.println("Queue Full");
        }
    }

    public void deQueue(){
        if(!isEmpty()){
            front=(front++)%5;
            size--;
        }
        else{
            System.out.println("Queue Empty");
        }
    }

    public void show(){
        for(int i=0; i<size; i++){
            System.out.println(queue[(front+i)%5]);
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public boolean isFull(){
        return size()==5;
    }
}
