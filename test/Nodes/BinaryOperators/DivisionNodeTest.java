package Nodes.BinaryOperators;

import Nodes.NumberNode;
import static org.junit.Assert.*;
import org.junit.Test;

public class DivisionNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("evaluate Division");
        NumberNode cuatro = new NumberNode(4);
        NumberNode dos = new NumberNode(2);
        DivisionNode instance = new DivisionNode(cuatro, dos);
        double expResult = 2;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testEvaluateByZero() {
        System.out.println("evaluate Division by Zero");
        NumberNode cuatro = new NumberNode(4);
        NumberNode zero = new NumberNode(0);
        DivisionNode instance = new DivisionNode(cuatro, zero);
        try {
            double result = instance.evaluate();
            fail("Division by Zero");
        } catch (RuntimeException ex) {
            assertTrue(true);
        }
    }
}
