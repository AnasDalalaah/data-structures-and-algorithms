# Stacks and Queues

## What is the Stack?

    - A type of Data Structure.

    - Chain of nodes, each node refernces to thee next one but not vice versa.

    - LIFO (Last nodes has pushed to the stack will be the first to be popped) OR FILO (First node that has pushed into the stack will be the last being popped).

<br>
<hr>
<br>

## What is the Queue?

    - A type of Data Structure.

    - Chain of nodes, each node refernces to thee next one but not vice versa.

    - FIFO (First node comes in will be the first to get out).


<br>
<hr>
<br>


## Challenge

- Implement both the stack and queue using the linked list.

<br>

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

## API

## Stack => 

<br>


- push() :

  - adds a new node with that value to the top of the stack.

- pop() :

  - This method returns the value from node from the top of the stack and removes the node from the top of the stack.
  - Should raise exception when called on empty stack.

- peek() :

   - This method returns the value of the node located at the top of the stack.
    
   - Should raise exception when called on empty stack.

- isEmpty() :

   - This Methos returns boolean indicating whether or not the stack is empty.


<br>
<hr>
<br>


## Queue => 


- enqueue() :

  - adds a new node with that value to the back of the queue.

- dequeue() :

  - This method returns the value from node from the front of the queue and removes the node from the front of the queue.
  - Should raise exception when called on empty queue.

- peek() :

   - This method returns the value of the node located at the front of the queue.
    
   - Should raise exception when called on empty queue.

- isEmpty() :

   - This Methos returns boolean indicating whether or not the queue is empty.


