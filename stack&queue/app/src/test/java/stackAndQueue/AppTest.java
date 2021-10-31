
package stack&queue;

import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test void pushToStackTest(){
        Stack stackTest = new Stack();
        stackTest.push("A");
        stackTest.push("N");
        assertNotEquals("A", stackTest.toString());
    }


@Test
    public void popStackTest(){
        Stack stackTest = new Stack();
        stackTest.push("A");
        stackTest.push("N");
        stackTest.push("A");
        stackTest.push("S");


        stackTest.pop();

        assertNotEquals("A", stackTest.toString());
    }

      @Test
    public void emptyStackTest() throws IllegalArgumentException {
        Stack stackTest = new Stack();
        stackTest.push("A");
        stackTest.push("N");
        stackTest.push("A");
        stackTest.push("S");
        stackTest.pop();
        stackTest.pop();
        stackTest.pop();
        stackTest.pop();

        assertNotEquals("Stack { Null }",stackTest.toString());
        assertTrue(stackTest.isEmpty());
    }
@Test
    public void whenExceptionThrown_thenAssertionSucceeds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
       Stack stackTest= new Stack();
            stackTest.peek();
        });

        String expectedMessage = "Empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void peekStackTest(){
        Stack stackTest = new Stack();
        stackTest.push("A");
        stackTest.push("N");
        stackTest.push("A");
        stackTest.push("S");

        assertEquals("A",stackTest.peek());
        stackTest.pop();
        assertEquals("N",stackTest.peek());
        assertEquals("S",stackTest.peek());
    }

    @Test
    public void enqueueToQueueTest(){
        Queue queueTest = new Queue();
        queueTest.enqueue("A");
        queueTest.enqueue("N");
        queueTest.enqueue("A");
         queueTest.enqueue("S");
        assertEquals("Queue{front=Node{data='A', next=Node{data='N',next=Node{data='A', next=Node{data='A', next=null}}}}, rear=Node{data='A', next=null}}",queueTest.toString());
    }

    @Test
    public void dequeueFromQueueTest(){
        Queue queueTest = new Queue();
        queueTest.enqueue("A");
        queueTest.enqueue("N");
        queueTest.enqueue("A");
         queueTest.enqueue("S");

        queueTest.dequeue();
        assertEquals("Queue{front=Node{data='A', next=Node{data='N', next=null}}, next=Node{data='A', next=null}}, rear=Node{data='S', next=null}}",queueTest.toString());
    }

    // (expected = IllegalArgumentException.class)

    @Test
    public void emptyQueueTest(){
        Queue queueTest = new Queue();
        queueTest.enqueue("A");
        queueTest.enqueue("N");
        queueTest.enqueue("A");
        queueTest.enqueue("S");


        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();

        assertTrue(queueTest.isEmpty());
        assertEquals("Queue{front=null, rear=Node{data='S', next=null}}",queueTest.toString());
        assertEquals( "empty",queueTest.dequeue());
      //  assertNull(queueTest.peek());
    }

    @Test
    public void peekQueueTest(){
        Queue queueTest = new Queue();
        queueTest.enqueue("A");
        queueTest.enqueue("N");
        queueTest.enqueue("A");
        queueTest.enqueue("S");

        assertEquals( java.util.Optional.of("A"), java.util.Optional.ofNullable(queueTest.peek()));
        queueTest.dequeue();
        assertEquals(java.util.Optional.of("N"),java.util.Optional.ofNullable(queueTest.peek()));
    }

   @Test

    public void enqueueDequeueTest() {
        PseudoQueue queueTest = new PseudoQueue();
        queueTest.enqueue("1");
        queueTest.enqueue("2");
        queueTest.enqueue("3");

        assertEquals("1",queueTest.dequeue());
    }

     @ Test
    public void enqueueDequeueEdgeCaseTest() {
        PseudoQueue queueTest = new PseudoQueue();
        assertEquals("queue is empty",queueTest.dequeue());
    }
}
