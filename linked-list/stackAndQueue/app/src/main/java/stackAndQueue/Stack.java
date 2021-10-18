package stackAndQueue;

public class Stack<T> {
    Node<T> top = null;


    public T push(T value) {
        Node<T> newNode = new Node<T>(value);
        if(top == null){
            top = newNode;
        }
        newNode.next = top;
        top = newNode;

        return value;
    }

    public T pop() throws Exception {
        T value;
        if (top == null){
            throw new Exception("This stack is empty");
        } else{
            value = top.value;
            top= top.next;
        }
        return top.value;
    }

    public T peek() throws Exception {
        if (top==null){
            throw new Exception("This stack is empty");
        }
        System.out.println("Peek for the top : " + top.value);
        return top.value;
    }

    public boolean isEmpty() {
        if(top == null){
            System.out.println("Is the stack empty? " + true);
            return true;
        } else
            System.out.println("Is the stack empty? " + false);
            return false;
    }

}
