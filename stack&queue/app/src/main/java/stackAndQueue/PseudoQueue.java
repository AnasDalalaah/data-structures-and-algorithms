package stack&queue;

public class PseudoQueue {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    public PseudoQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();

    }



    public void enqueue(int value){

        while (stack1.top!=null){
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (stack2.top != null){
            stack1.push(stack2.pop());

        }
    }



    public int dequeue(){

        if (stack1.top == null){
            throw new IllegalArgumentException("Empty");
        }
        int popped = stack1.peek();
        stack1.pop();
        return popped;
    }

    @Override
    public String toString() {

        return stack1.toString();

    }
}
/*
public class PseudoQueue implements QueueInterFace{


    Stack stack1;
    Stack stack2;

    public PseudoQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    @Override
    public void enqueue(String value) {
        stack1.push(value);
    }

    @Override
    public String dequeue() {
        if (stack1.isEmpty()){
            return "queue is empty";
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            String data = stack2.pop();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            return data;
        }
    }
}
*/