
package stack&queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
   /* @Test public void appHasAGreeting() {
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
    }*/

    //  *********************** code challenge 12 ********************
   @Test
    public void enqueueAnimalShelterTest(){

        AnimalShelter shelterTest = new AnimalShelter();

        shelterTest.enqueue(new Cat("Bella"));
        shelterTest.enqueue(new Cat("Leo"));
        assertEquals("AnimalShelter { catQueue = Queue { Bella --> Leo --> Null }, dogQueue = Queue { Null } }",shelterTest.toString());
        assertEquals("Bella", shelterTest.catQueue.peek().toString());

        shelterTest.enqueue(new Dog("BUDDY"));
        shelterTest.enqueue(new Dog("MILO"));
        assertEquals("AnimalShelter { catQueue = Queue { Bella --> Leo --> Null }, dogQueue = Queue { BUDDY --> MILO --> Null } }",shelterTest.toString());
        assertEquals("BUDDY", shelterTest.dogQueue.peek().toString());

        assertFalse(shelterTest.catQueue.isEmpty());
        assertFalse(shelterTest.dogQueue.isEmpty());

        shelterTest.dequeue("cat");
        assertEquals("AnimalShelter { catQueue = Queue { Leo --> Null }, dogQueue = Queue { BUDDY --> MILO --> Null } }",shelterTest.toString());

        shelterTest.dequeue("dog");
        assertEquals("AnimalShelter { catQueue = Queue { Leo --> Null }, dogQueue = Queue { MILO --> Null } }",shelterTest.toString());

        shelterTest.dequeue("cat");
        shelterTest.dequeue("dog");
        assertEquals("AnimalShelter { catQueue = Queue { Null }, dogQueue = Queue { Null } }",shelterTest.toString());
        assertTrue(shelterTest.catQueue.isEmpty());
        assertTrue(shelterTest.dogQueue.isEmpty());

        assertNull(shelterTest.dequeue("cat"));
        assertNull(shelterTest.dequeue("dog"));

}

    //  *********************** code challenge 13 ********************


    @Test
    public void validateBracketsTest(){

        ValidateBrackets test = new ValidateBrackets();

        assertTrue(test.validateBrackets("{}"));
        assertTrue(test.validateBrackets("{}(){}"));
        assertTrue(test.validateBrackets("()[[Extra Characters]]"));
        assertTrue(test.validateBrackets("(){}[[]]"));
        assertTrue(test.validateBrackets("{}{Code}[Fellows](())"));

        assertFalse(test.validateBrackets("[({}]"));
        assertFalse(test.validateBrackets("(]("));
        assertFalse(test.validateBrackets("{(})"));
        assertFalse(test.validateBrackets(")"));
        assertFalse(test.validateBrackets("[}"));
        assertFalse(test.validateBrackets("["));

    }

}