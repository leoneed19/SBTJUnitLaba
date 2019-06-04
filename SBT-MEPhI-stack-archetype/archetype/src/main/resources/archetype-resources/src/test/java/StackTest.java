import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * write tests for {@link Stack} here
 */
public class StackTest {
    Stack stack;
    Stack qwer;
    int a;
    int b;
    @Before
    public void beforeTest(){
        stack = new Stack();
        qwer = new Stack();
        stack.push("Test");
        b = stack.size();
       a = qwer.size();
    }
    @Test
    public void isEmpty() {
        assertTrue(qwer.isEmpty());
    }

    @Test
    public void size() {
        assertTrue(a+1==b);
    }

    @Test
    public void push() {
        assertTrue(a+1 == b);
        assertTrue(stack.peek().equals("Test"));
    }

    @Test(expected = NoSuchElementException.class)
    public void pop() {
        stack.pop();
        assertTrue(a == stack.size());
        stack.push("Test");
        Stack ex = new Stack();
        ex.pop();
    }

    @Test(expected = NoSuchElementException.class)
    public void peek() {
        assertTrue(stack.peek().equals("Test"));
        qwer.peek();
    }

    @Test
    public void toStringTest() {
        Stack tST = new Stack();
        tST.push("1");
        tST.push("2");
        String res = tST.toString();
        assertEquals(res, "2 1 ");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void iterator() {
        qwer.push("Test it");
        Stack.ListIterator qwertiterator = (Stack.ListIterator) qwer.iterator();
        assertTrue(qwertiterator.next().equals("Test it"));
        qwer.pop();
        qwertiterator.remove();
    }
    @Test(expected = NoSuchElementException.class)
    public void iterCheck(){
        Stack.ListIterator qwertiterator = (Stack.ListIterator) qwer.iterator();
        qwertiterator.next();
    }
}
