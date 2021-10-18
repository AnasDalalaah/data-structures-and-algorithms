
package stack&queue;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    //Can successfully push onto a stack
    @Test public void pushOntoStack() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(5);
        assertEquals(5, stack.top.value, 0);
    }

    //Can successfully push multiple values onto a stack
    @Test public void pushMultipleValues() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(5);
        stack.push(2);
        stack.push(10);
        assertEquals(2, stack.top.next);
    }

    //Can successfully pop off the stack
    @Test public void popFromTheStack() throws Exception {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(2);
        stack.push(10);
        stack.pop();
        assertEquals(2, stack.top.value, 0);
    }

    //Can successfully empty a stack after multiple pops
    @Test public void popMultipleValues() throws Exception {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(2);
        stack.push(10);
        stack.pop();
        stack.pop();
        assertEquals(5, stack.top.value, 0);
    }

   
    @Test public void instantiateAnEmptyStack(){
        Stack<Integer> stack = new Stack<Integer>();

        assertTrue(stack.isEmpty());
    }

    @Test public void peekOnEmptyStack() throws Exception {
        Stack<Integer> stack = new Stack<Integer>();

        assertEquals("This stack is empty for", stack.pop());

    }
}
