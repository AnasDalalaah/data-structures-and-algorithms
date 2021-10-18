package stack&queue;

public class Queue<T> {
    Node<T> front = null;
    Node<T> rear = null;

    public void enqueue(T value){
        Node<T> newNode = new Node<T>(value);
        rear = front;
        if(front == null) {
            front = newNode;
            rear = front;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }

    }

    public T dequeue() throws Exception {
        if(front == null){
            throw new Exception("This queue is empty");
        } else {
            front = front.next;
        }

        System.out.println("The removed value : " + front.value);
        return front.value;
    }

    public T peek() throws Exception {
        if(front == null){
            throw new Exception("This queue is empty");
        }
        return front.value;
    }

    public boolean isEmpty() {
        if (front==null){
            System.out.println(true);
            return true;
        } else
            System.out.println(false);
        return false;
    }
}

